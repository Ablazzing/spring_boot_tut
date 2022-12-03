package org.example.app.lesson3.entity;

import lombok.Data;
import lombok.NonNull;

@Data
public class Car {
    private Integer id;

    @NonNull
    private String name;
}
