package org.example.homework2.service;

import lombok.AllArgsConstructor;
import org.example.homework2.dao.EmployeeDao;
import org.example.homework2.dto.EmployeeDto;
import org.example.homework2.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class EmployeeService {
    private final EmployeeDao employeeDao;
    private final EmployeeMapper employeeMapper;

    public Integer create(EmployeeDto employeeDto) {
        return employeeDao.create(employeeMapper.castFromRq(employeeDto));
    }

    public Boolean delete(Integer id) {
        return employeeDao.delete(id);
    }

    public Boolean update(EmployeeDto employeeDto) {
        return employeeDao.update(employeeMapper.castFromRq(employeeDto));
    }

    public Optional<EmployeeDto> get(Integer id) {
        return employeeDao.findById(id).map(employeeMapper::castFromEntity);
    }
}
