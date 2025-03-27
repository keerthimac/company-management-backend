package com.maco.universal.company.system.dto.supplier;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SupplierDto {
    private String id;
    private String name;
    private String location;
    private String contactInfo;
    private List<SupplierItemDto> supplierItems;
}
