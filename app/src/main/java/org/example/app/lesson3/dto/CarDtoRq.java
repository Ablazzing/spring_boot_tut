package org.example.app.lesson3.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CarDtoRq {
    @JsonProperty("name")
    private String mark;
}
