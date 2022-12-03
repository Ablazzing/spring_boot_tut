package org.example.app.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.app.dto.CarDtoRq;
import org.example.app.entity.Car;
import org.example.app.mapper.CarMapper;
import org.example.app.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@PropertySource("example.properties")
public class FirstController {
    private final CarMapper carMapper;
    private final CarService carService;

    @Value("${yuri.age}")
    private Integer age;

    @Value("${petr.age}")
    private Integer petrAge;

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

    @GetMapping(path = "/age")
    public Integer getMyAge() {
        return petrAge;
    }

    @GetMapping(path = "/count")
    public Integer getCountEmployees() {
        return 100;
    }
}
