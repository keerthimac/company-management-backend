package com.maco.universal.company.system.mapper;

import com.maco.universal.company.system.dto.purchaseOrder.PurchaseOrderDetailsDto;
import com.maco.universal.company.system.dto.purchaseOrder.PurchaseOrderDto;
import com.maco.universal.company.system.entities.purchaseOrder.PurchaseOrderDetailsEntity;
import com.maco.universal.company.system.entities.purchaseOrder.PurchaseOrderEntity;
import org.mapstruct.Mapper;

@Mapper
public interface PurchaseOrderMapper {
    PurchaseOrderDto purchaseOrderEntityToPurchaseOrderDto(PurchaseOrderEntity purchaseOrderEntity);
    PurchaseOrderEntity purchaseOrderDtoToPurchaseOrderEntity(PurchaseOrderDto purchaseOrderDto);
    PurchaseOrderDetailsDto purchaseOrderDetailsEntityToPurchaseOrderDetailsDto(PurchaseOrderDetailsEntity purchaseOrderDetailsEntity);
    PurchaseOrderEntity purchaseOrderDetailsDtoToPurchaseOrderDetailsEntity(PurchaseOrderDetailsDto purchaseOrderDetailsDto);
}
