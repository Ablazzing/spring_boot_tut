package org.example.spring_boot_tut.entity;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
public class Car {
    private Integer id;

    @NonNull
    private String name;
}
