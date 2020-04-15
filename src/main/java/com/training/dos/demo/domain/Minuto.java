package com.training.dos.demo.domain;

import com.google.common.base.Preconditions;
import lombok.Value;

@Value(staticConstructor = "of")
public class Minuto {

    private final Integer value;

    public Minuto(Integer val){
        Preconditions.checkArgument(val >= 0 && val <= 59);
        this.value = val;
    }
}
