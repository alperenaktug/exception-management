package com.alperenaktug.service;

import com.alperenaktug.dto.DtoEmployee;
import com.alperenaktug.model.Employee;

public interface IEmployeeService {

    public DtoEmployee findEmployeeById(Long id);
}
