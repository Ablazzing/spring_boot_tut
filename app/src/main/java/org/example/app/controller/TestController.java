package org.example.app.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {

    public TestController() {
        log.info("Создала тестовый контроллер");
    }

    @GetMapping("/test")
    public String myTest() {
       return "OK!";
    }
}
