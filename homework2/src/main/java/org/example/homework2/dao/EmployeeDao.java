package org.example.homework2.dao;

import org.example.homework2.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class EmployeeDao {
    private Map<Integer, Employee> data = new HashMap<>();
    private int counter = 0;

    public Integer create(Employee employee) {
        counter++;
        employee.setId(counter);
        data.put(counter, employee);
        return counter;
    }

    public Optional<Employee> findById(Integer id) {
        return Optional.ofNullable(data.get(id));
    }

    public Boolean delete(Integer id) {
        Employee removedEmployee = data.remove(id);
        return removedEmployee != null;
    }

    public Boolean update(Employee employee) {
        if (data.containsKey(employee.getId())) {
            data.put(employee.getId(), employee);
            return true;
        }
        return false;
    }
}
