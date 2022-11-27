package org.example.spring_boot_tut.mapper;

import org.example.spring_boot_tut.dto.CarDtoRq;
import org.example.spring_boot_tut.entity.Car;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {

    public Car convertCarRq(CarDtoRq carDtoRq) {
        return new Car(carDtoRq.getMark());
    }
}
