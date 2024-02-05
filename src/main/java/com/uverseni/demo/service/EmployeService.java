package com.uverseni.demo.service;


import com.uverseni.demo.dto.request.EmployeRequest;
import com.uverseni.demo.dto.response.EmployeResponse;
import com.uverseni.demo.entity.EmployeEntity;

import java.util.List;
import java.util.Optional;

public interface EmployeService {
    List<EmployeEntity> findAllEmploye();
    Optional<EmployeEntity> findById(Long id);
    EmployeEntity saveEmploye(EmployeEntity employeEntity);
    EmployeEntity updateEmploye(EmployeEntity employeEntity);
    void deleteEmploye(Long id);

    EmployeResponse saveEmploye(EmployeRequest employeRequest);
    EmployeResponse updateEmploye(EmployeRequest employeRequest, Long id);


}
