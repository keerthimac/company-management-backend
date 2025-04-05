package com.maco.universal.company.system.mapper;

import com.maco.universal.company.system.dto.employee.EmployeeDto;
import com.maco.universal.company.system.entities.employee.EmployeeEntity;
import org.mapstruct.Mapper;

@Mapper
public interface EmployeeMapper {
    EmployeeDto employeeEntityToEmployeeDto(EmployeeEntity employeeEntity);
    EmployeeEntity employeeDtoToEmployeeEntity(EmployeeDto employeeDto);
}
