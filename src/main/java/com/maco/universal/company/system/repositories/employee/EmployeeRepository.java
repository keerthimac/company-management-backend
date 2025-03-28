package com.maco.universal.company.system.repositories.employee;

import com.maco.universal.company.system.entities.employee.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {
}