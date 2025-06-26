package com.alperenaktug.controller;

import com.alperenaktug.dto.DtoEmployee;
import com.alperenaktug.model.RootEntity;

public interface RestEmployeeController {

    public RootEntity<DtoEmployee> findEmployeeById(Long id);
}
