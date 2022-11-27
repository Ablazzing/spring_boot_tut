package org.example.spring_boot_tut.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.spring_boot_tut.dto.CarDtoRq;
import org.example.spring_boot_tut.entity.Car;
import org.example.spring_boot_tut.mapper.CarMapper;
import org.example.spring_boot_tut.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class FirstController {
    private CarMapper carMapper;
    private CarService carService;

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public String test() {
        log.info("Работает, Ура!");
        return "Ура, работает!";
    }

    @PostMapping(path = "/test")
    public String test2() {
        return "Постмаппинг работает!";
    }

    @PostMapping(path = "/car")
    public Car createCar(@RequestBody CarDtoRq carDtoRq) {
        log.info(carDtoRq.toString());
        return carMapper.convertCarRq(carDtoRq);
    }

    @PostMapping(path = "/get_car_price")
    public Integer getCarPrice(@RequestBody CarDtoRq carDtoRq) {
        return carService.getPrice(carDtoRq);
    }

    @GetMapping(path = "/car/{id}")
    public void getCarId(@PathVariable Integer id) {
        log.info("Ид машины " + id);
    }

}
