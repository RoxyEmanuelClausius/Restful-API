package com.uverseni.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import com.uverseni.demo.dto.request.EmployeRequest;
import com.uverseni.demo.dto.response.EmployeResponse;
import com.uverseni.demo.entity.EmployeEntity;
import com.uverseni.demo.service.EmployeService;

@RestController
@RequestMapping("/employe")
public class EmployeController {

    private final EmployeService employeService;

    public EmployeController(EmployeService employeService) {
        this.employeService = employeService;
    }

    @GetMapping
    public List<EmployeEntity> findAllEmploye() {
        return employeService.findAllEmploye();
    }

    @GetMapping("/{id}")
    public Optional<EmployeEntity> findEmployeById(@PathVariable("id") Long id) {
        return employeService.findById(id);
    }

    @PostMapping
    public EmployeEntity saveEmploye(@RequestBody EmployeEntity employeEntity) {
        return employeService.saveEmploye(employeEntity);
    }

    @PutMapping
    public EmployeEntity updateEmploye(@RequestBody EmployeEntity employeEntity) {
        return employeService.updateEmploye(employeEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteEmploye(@PathVariable("id") Long id) {
        employeService.deleteEmploye(id);
    }


    @PostMapping("/res")
    public EmployeResponse saveEmpResponse(@RequestBody EmployeRequest employeRequest) {
        return employeService.saveEmploye(employeRequest);
    }

    @PutMapping("/res/{id}")
    public EmployeResponse updateEmpResponse(@RequestBody EmployeRequest employeRequest, @PathVariable("id") Long id) {
        return employeService.updateEmploye(employeRequest, id);
    }

}
