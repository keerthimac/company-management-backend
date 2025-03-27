package com.maco.universal.company.system.dto.bill;

import com.maco.universal.company.system.dto.supplier.SupplierDto;

import java.util.Date;
import java.util.List;

public class BillDto {
    private Integer id;
    private Date date;
    private List<BillDetailsDto> billDetails;
    private SupplierDto supplier;
}
