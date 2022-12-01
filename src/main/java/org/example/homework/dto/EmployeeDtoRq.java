package org.example.homework.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EmployeeDtoRq {
    private Integer id;
    private String name;
    private Integer age;
    private Integer salary;
}
