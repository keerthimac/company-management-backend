package com.maco.universal.company.system.mapper;

import com.maco.universal.company.system.dto.requestOrder.RequestOrderDetailsDto;
import com.maco.universal.company.system.dto.requestOrder.RequestOrderDto;
import com.maco.universal.company.system.entities.requestOrder.RequestOrderDetailsEntity;
import com.maco.universal.company.system.entities.requestOrder.RequestOrderEntity;
import org.mapstruct.Mapper;

@Mapper
public interface RequestOrderMapper {
    RequestOrderDto requestOrderEntityToRequestOrderDto(RequestOrderEntity requestOrderEntity);
    RequestOrderEntity requestOrderDtoToRequestOrderEntity(RequestOrderDto requestOrderDto);

    RequestOrderDetailsDto requestOrderDetailsEntityToRequestOrderDetailsDto(RequestOrderDetailsEntity requestOrderDetailsEntity);
    RequestOrderEntity requestOrderDetailsDtoToRequestOrderDetailsEntity(RequestOrderDetailsDto requestOrderDetailsDto);
}
