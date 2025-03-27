package com.maco.universal.company.system.dto.purchaseOrder;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PurchaseOrderDto {
    private Integer id;
    private Date date;
    private String status;
    private Date expectedDelivery;
}
