package com.uverseni.demo.dto.mapper;

import com.uverseni.demo.dto.request.EmployeRequest;
import com.uverseni.demo.dto.response.EmployeResponse;
import com.uverseni.demo.entity.EmployeEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-05T15:41:45+0700",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
public class EmployeMapperImpl implements EmployeMapper {

    @Override
    public EmployeEntity fromRequestToEntity(EmployeRequest employeRequest) {
        if ( employeRequest == null ) {
            return null;
        }

        EmployeEntity employeEntity = new EmployeEntity();

        employeEntity.setName( employeRequest.getName() );
        employeEntity.setGender( employeRequest.getGender() );
        employeEntity.setDateOfBirth( employeRequest.getDateOfBirth() );
        employeEntity.setAddress( employeRequest.getAddress() );

        return employeEntity;
    }

    @Override
    public EmployeResponse fromEntityToResponse(EmployeEntity employeEntity) {
        if ( employeEntity == null ) {
            return null;
        }

        EmployeResponse employeResponse = new EmployeResponse();

        employeResponse.setId( employeEntity.getId() );
        employeResponse.setName( employeEntity.getName() );
        employeResponse.setGender( employeEntity.getGender() );
        employeResponse.setDateOfBirth( employeEntity.getDateOfBirth() );
        employeResponse.setAddress( employeEntity.getAddress() );

        return employeResponse;
    }
}
