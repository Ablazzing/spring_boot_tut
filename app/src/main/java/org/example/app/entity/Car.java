package org.example.app.entity;

import lombok.Data;
import lombok.NonNull;

@Data
public class Car {
    private Integer id;

    @NonNull
    private String name;
}
