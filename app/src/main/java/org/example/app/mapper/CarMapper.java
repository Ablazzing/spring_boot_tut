package org.example.app.mapper;

import org.example.app.dto.CarDtoRq;
import org.example.app.entity.Car;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {

    public Car convertCarRq(CarDtoRq carDtoRq) {
        return new Car(carDtoRq.getMark());
    }
}
