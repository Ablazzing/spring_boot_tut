package org.example.homework.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    //private Integer id;
    private String name;
    private Integer age;
    private Integer salary;
}