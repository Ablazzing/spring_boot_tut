package org.example.homework.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.homework.dto.EmployeeDtoRq;
import org.example.homework.entity.Employee;
import org.example.homework.mapper.EmployeeMapper;
import org.example.homework.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private EmployeeMapper employeeMapper;

    @GetMapping("/get/{id}")
    public @ResponseBody Employee getEmployee(@PathVariable Integer id) {
        return employeeService.get(id);
    }

    @PostMapping("/create")
    public Employee createEmployee(@RequestBody EmployeeDtoRq employeeDtoRq) {
        return employeeService.create(employeeDtoRq);
    }
    @GetMapping("/delete/{id}")
    public Integer deleteEmployee(@PathVariable Integer id) {
        System.out.println("Удалили работника: #" + employeeService.delete(id));
        return employeeService.delete(id);
    }

    @PostMapping("/update")
    public Integer updateEmployee(@RequestBody EmployeeDtoRq employeeDtoRq) {
        System.out.println("Обновили работника: #" + employeeService.update(employeeDtoRq));
        return employeeService.update(employeeDtoRq);
    }
}
