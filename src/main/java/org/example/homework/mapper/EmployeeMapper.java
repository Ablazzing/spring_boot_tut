package org.example.homework.mapper;


import org.example.homework.dto.EmployeeDtoRq;
import org.example.homework.entity.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {
    public Employee convertEmployeeRq(EmployeeDtoRq employeeDtoRq) {
        return new Employee(employeeDtoRq.getName(), employeeDtoRq.getAge(), employeeDtoRq.getSalary());
    }
}
