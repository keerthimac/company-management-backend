package com.maco.universal.company.system.dto.requestOrder;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RequestOrderDto {
    private Integer id;
    private Date date;
    private String priority;
}
