package com.training.dos.demo.configuration;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.training.dos.demo.domain.HoraDia;
import com.training.dos.demo.serialization.HoraDiaAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GsonConfiguration {

@Bean
    public Gson gson(){
        return new GsonBuilder()
                .registerTypeAdapter(HoraDia.class, new HoraDiaAdapter())
                .create();
    }
}
