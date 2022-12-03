package org.example.homework2.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.homework2.dto.EmployeeDto;
import org.example.homework2.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class EmployeeController {
    private final EmployeeService employeeService;

    @PostMapping("/create")
    public Integer create(@RequestBody EmployeeDto employeeDto) {
        return employeeService.create(employeeDto);
    }

    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable Integer id) {
        return employeeService.delete(id);
    }

    @PatchMapping("/update")
    public Boolean update(@RequestBody EmployeeDto employeeDto) {
        return employeeService.update(employeeDto);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity get(@PathVariable Integer id) {
        log.info("Получение пользователя по id {}", id);
        try {
            EmployeeDto employeeDto = employeeService.get(id)
                    .orElseThrow(() -> new RuntimeException("Нет такого человека"));
            return new ResponseEntity<>(employeeDto, HttpStatus.ACCEPTED);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

}
