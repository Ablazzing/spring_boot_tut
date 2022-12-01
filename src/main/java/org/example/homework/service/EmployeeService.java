package org.example.homework.service;

import org.example.homework.dao.EmployeeDao;
import org.example.homework.dto.EmployeeDtoRq;
import org.example.homework.entity.Employee;
import org.example.homework.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private EmployeeMapper employeeMapper;


    public Employee create(EmployeeDtoRq employeeDtoRq) {
        System.out.println("lastid = " + employeeDao.getLastId());
        HashMap<Integer, Employee> hashMap = new HashMap<>();
        hashMap.put(employeeDao.getLastId(), employeeMapper.convertEmployeeRq(employeeDtoRq));
        employeeDao.setEmployeeDaoHashMap(hashMap);
        employeeDao.setLastId(employeeDao.getLastId()+1);
        return employeeMapper.convertEmployeeRq(employeeDtoRq);
    }

    public Integer delete(Integer id) {
        HashMap<Integer, Employee> hashMap = employeeDao.getEmployeeDaoHashMap();
        System.out.println(employeeDao.getEmployeeDaoHashMap().toString());
        employeeDao.setEmployeeDaoHashMap(hashMap);
        employeeDao.setLastId(employeeDao.getLastId()-1);
        return id;
    }

    public Integer update(EmployeeDtoRq employeeDtoRq) {
        employeeDao.employeeDaoHashMap.put(employeeDtoRq.getId(), employeeMapper.convertEmployeeRq(employeeDtoRq));
        return employeeDtoRq.getId();
    }

    public Employee get(Integer id) {
        return employeeDao.employeeDaoHashMap.get(id);
    }

}
