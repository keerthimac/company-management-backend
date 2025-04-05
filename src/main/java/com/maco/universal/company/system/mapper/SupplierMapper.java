package com.maco.universal.company.system.mapper;

import com.maco.universal.company.system.dto.supplier.SupplierDto;
import com.maco.universal.company.system.dto.supplier.SupplierItemDto;
import com.maco.universal.company.system.entities.supplier.SupplierEntity;
import com.maco.universal.company.system.entities.supplier.SupplierItemEntity;
import org.mapstruct.Mapper;

@Mapper
public interface SupplierMapper {
    SupplierDto supplierEntityToSupplierDto(SupplierEntity supplierEntity);
    SupplierEntity supplierDtoToSupplierEntity(SupplierDto supplierDto);

    SupplierItemDto supplierItemEntityToSupplierItemDto(SupplierItemEntity supplierItemEntity);
    SupplierEntity supplierItemDtoToSupplierItemEntity(SupplierItemDto supplierItemDto);
}
