package com.alperenaktug.controller.Impl;

import com.alperenaktug.controller.RestEmployeeController;
import com.alperenaktug.dto.DtoEmployee;
import com.alperenaktug.model.RootEntity;
import com.alperenaktug.service.Impl.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/rest/api/employee")
public class RestEmployeeControllerImpl extends RestBaseController implements RestEmployeeController {

    @Autowired
   private EmployeeService employeeService;

    @GetMapping(path = "/list/{id}")
    @Override
    public RootEntity<DtoEmployee> findEmployeeById(@PathVariable(name = "id") Long id) {
        return ok(employeeService.findEmployeeById(id));
    }
}
