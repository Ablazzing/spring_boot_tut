package org.example.homework.dao;

import lombok.Data;
import org.example.homework.entity.Employee;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
@Service
@Data
public class EmployeeDao {
    public Integer lastId = 1;
    public HashMap<Integer, Employee> employeeDaoHashMap;

}
