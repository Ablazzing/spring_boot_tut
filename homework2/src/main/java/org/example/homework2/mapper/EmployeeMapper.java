package org.example.homework2.mapper;

import org.example.homework2.dto.EmployeeDto;
import org.example.homework2.entity.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {

    public Employee castFromRq(EmployeeDto employeeDto) {
        return  Employee.builder()
                .id(employeeDto.getId())
                .age(employeeDto.getAge())
                .name(employeeDto.getName())
                .salary(employeeDto.getSalary())
                .build();
    }

    public EmployeeDto castFromEntity(Employee employee) {
        return new EmployeeDto(employee.getId(), employee.getName(), employee.getAge(), employee.getSalary());
    }
}
