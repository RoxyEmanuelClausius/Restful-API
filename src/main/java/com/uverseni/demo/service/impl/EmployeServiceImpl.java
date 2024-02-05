package com.uverseni.demo.service.impl;

import com.uverseni.demo.dto.mapper.EmployeMapper;
import com.uverseni.demo.dto.request.EmployeRequest;
import com.uverseni.demo.dto.response.EmployeResponse;
import com.uverseni.demo.entity.EmployeEntity;
import com.uverseni.demo.repository.EmployeRepository;
import com.uverseni.demo.service.EmployeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeServiceImpl implements EmployeService {

    private final EmployeRepository employeRepository;

    public EmployeServiceImpl(EmployeRepository employeRepository) {
        this.employeRepository = employeRepository;
    }

    @Override
    public List<EmployeEntity> findAllEmploye() {
        return employeRepository.findAll();
    }

    @Override
    public Optional<EmployeEntity> findById(Long id) {
        return employeRepository.findById(id);
    }

    @Override
    public EmployeEntity saveEmploye(EmployeEntity employeEntity) {
        return employeRepository.save(employeEntity);
    }

    @Override
    public EmployeEntity updateEmploye(EmployeEntity employeEntity) {
        return employeRepository.save(employeEntity);
    }

    @Override
    public void deleteEmploye(Long id) {
        employeRepository.deleteById(id);
    }

    @Override
    public EmployeResponse saveEmploye(EmployeRequest employeRequest) {
        EmployeEntity employeEntity = EmployeMapper.MAPPER.fromRequestToEntity(employeRequest);
        employeRepository.save(employeEntity);
        return EmployeMapper.MAPPER.fromEntityToResponse(employeEntity);
    }

    @Override
    public EmployeResponse updateEmploye(EmployeRequest employeRequest, Long id) {

        Optional<EmployeEntity> checkExistingEmploye = findById(id);
        if (! checkExistingEmploye.isPresent())
            throw new RuntimeException("Employe Id "+ id + " Not Found!");

        EmployeEntity employeEntity = EmployeMapper.MAPPER.fromRequestToEntity(employeRequest);
        employeEntity.setId(id);
        employeRepository.save(employeEntity);
        return EmployeMapper.MAPPER.fromEntityToResponse(employeEntity);
    }

}
