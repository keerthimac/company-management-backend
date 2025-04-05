package com.maco.universal.company.system.mapper;

import com.maco.universal.company.system.dto.bill.BillDetailsDto;
import com.maco.universal.company.system.dto.bill.BillDto;
import com.maco.universal.company.system.entities.bill.BillDetailEntity;
import com.maco.universal.company.system.entities.bill.BillEntity;
import org.mapstruct.Mapper;

@Mapper
public interface BillMapper {
    BillDto billEntityToBillDto(BillEntity billEntity);
    BillEntity billDtoToBillEntity(BillDto billDto);

    BillDetailsDto billDetailEntityToBillDetailDto(BillDetailEntity billDetailEntity);
    BillDetailEntity billDetailDtoToBillDetailEntity(BillDetailsDto billDetailsDto);
}
