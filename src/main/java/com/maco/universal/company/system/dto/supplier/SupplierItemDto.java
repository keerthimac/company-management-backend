package com.maco.universal.company.system.dto.supplier;

import com.maco.universal.company.system.dto.item.ItemDto;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SupplierItemDto {
    private Integer id;
    private Double price;
    private String code;
    private Date priceEffectiveFrom;
    private Date priceEffectiveTo;
    ItemDto item;
    SupplierDto supplier;
}
