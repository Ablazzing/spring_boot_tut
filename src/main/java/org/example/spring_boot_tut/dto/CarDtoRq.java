package org.example.spring_boot_tut.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
public class CarDtoRq {
    @JsonProperty("name")
    private String mark;
}
