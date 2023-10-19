package com.example.limitsservice.controller;

import com.example.limitsservice.config.LimitsConfiguration;
import com.example.limitsservice.model.Limits;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/api/limits")
@RequiredArgsConstructor
public class LimitsController {
    private  final LimitsConfiguration limitsConfiguration;
    @GetMapping("/getlimits")
    public Limits retrieveLimits(){
//        return Limits.builder()
//                .maximumValue(1000)
//                .minimumValue(100)
//                .build();
        return Limits.builder()
                .maximumValue(limitsConfiguration.getMaximumValue())
                .minimumValue(limitsConfiguration.getMinimumValue())
                .build();

    }
}
