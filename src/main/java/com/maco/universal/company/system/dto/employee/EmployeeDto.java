package com.maco.universal.company.system.dto.employee;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmployeeDto {
    private Integer id;
    private String name;
    private String position;
    private String contactInfo;
}
