package org.example.homework2.dto;

import lombok.*;

import java.math.BigDecimal;

@Value
public class EmployeeDto {
    Integer id;
    String name;
    Integer age;
    BigDecimal salary;
}
