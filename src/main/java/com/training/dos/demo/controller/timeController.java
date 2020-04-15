package com.training.dos.demo.controller;

import com.training.dos.demo.domain.UnidadTiempo;
import com.training.dos.demo.domain.*;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
@RequestMapping(value = "/")
@AllArgsConstructor
public class timeController {

    private UnidadTiempo unidadTiemp;

    @GetMapping(value = "timecurrent")
    public HoraDia getCurrentTime(){
        System.out.println(this.unidadTiemp.getUnidad());
        LocalTime currentTime = LocalTime.now();
        return HoraDia.from(Hora.of(currentTime.getHour()),
                Minuto.of(currentTime.getMinute()),
                Segundo.of(currentTime.getSecond()),
                TimeUnitEnum.fromHour(TimeUnitEnum.valueOf(unidadTiemp.getUnidad()), currentTime)
        );
    }
}
