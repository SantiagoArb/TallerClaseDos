package com.training.dos.demo.domain;

import com.google.common.base.Preconditions;
import lombok.Value;

@Value(staticConstructor = "of")
public class Hora {

    private final Integer value;

    private Hora(Integer val){
        Preconditions.checkArgument(val >= 0 && val <= 23);
        this.value = val;
    }
}
