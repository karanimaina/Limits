package com.example.limitsservice.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Limits {
    int minimumValue;
    int maximumValue;
}
