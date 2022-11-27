package org.example.spring_boot_tut.service;

import org.example.spring_boot_tut.dto.CarDtoRq;
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
