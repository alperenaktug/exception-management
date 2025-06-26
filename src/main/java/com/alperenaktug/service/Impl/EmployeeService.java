package com.alperenaktug.service.Impl;

import com.alperenaktug.dto.DtoDepartment;
import com.alperenaktug.dto.DtoEmployee;
import com.alperenaktug.exception.BaseException;
import com.alperenaktug.exception.ErrorMessage;
import com.alperenaktug.exception.MessageType;
import com.alperenaktug.model.Department;
import com.alperenaktug.model.Employee;
import com.alperenaktug.repository.EmployeeRepository;
import com.alperenaktug.service.IEmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public DtoEmployee findEmployeeById(Long id) {
        DtoEmployee dtoEmployee = new DtoEmployee();
        DtoDepartment dtoDepartment = new DtoDepartment();

     Optional<Employee> optional = employeeRepository.findById(id);
     if(optional.isEmpty()){
         throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST , id.toString()));
     }
     Employee employee = optional.get();
        Department department = employee.getDepartment();

        BeanUtils.copyProperties(employee, dtoEmployee);
        BeanUtils.copyProperties(department, dtoDepartment);

        dtoEmployee.setDepartment(dtoDepartment);


        return dtoEmployee;
    }
}
