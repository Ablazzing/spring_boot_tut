package org.example.app.lesson3.mapper;

import org.example.app.lesson3.dto.CarDtoRq;
import org.example.app.lesson3.entity.Car;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {

    public Car convertCarRq(CarDtoRq carDtoRq) {
        return new Car(carDtoRq.getMark());
    }
}
