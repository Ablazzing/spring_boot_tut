package org.example.app.lesson3.service;

import org.example.app.lesson3.dto.CarDtoRq;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    public Integer getPrice(CarDtoRq carDtoRq) {
        if (carDtoRq.getMark().equals("bmw")) {
            return 10_000;
        }
        return 0;
    }
}
