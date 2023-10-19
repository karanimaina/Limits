package com.example.limitsservice.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ConfigurationProperties("limits-service")
@Component
public class LimitsConfiguration {
   private int maximumValue;
   private int minimumValue;


}
