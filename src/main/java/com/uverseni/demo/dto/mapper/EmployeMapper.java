package com.uverseni.demo.dto.mapper;

import com.uverseni.demo.dto.request.EmployeRequest;
import com.uverseni.demo.dto.response.EmployeResponse;
import com.uverseni.demo.entity.EmployeEntity;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeMapper {
    EmployeMapper MAPPER = Mappers.getMapper(EmployeMapper.class);
    EmployeEntity fromRequestToEntity(EmployeRequest employeRequest);
    EmployeResponse fromEntityToResponse(EmployeEntity employeEntity);
}
