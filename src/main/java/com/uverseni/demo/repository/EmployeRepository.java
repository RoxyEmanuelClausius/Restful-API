package com.uverseni.demo.repository;

import com.uverseni.demo.entity.EmployeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeRepository extends JpaRepository<EmployeEntity, Long> {
}
