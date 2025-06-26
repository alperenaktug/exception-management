package com.alperenaktug.controller;

import com.alperenaktug.dto.DtoEmployee;

public interface RestEmployeeController {

    public DtoEmployee findEmployeeById(Long id);
}
