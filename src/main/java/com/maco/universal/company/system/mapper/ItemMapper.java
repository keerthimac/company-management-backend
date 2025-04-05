package com.maco.universal.company.system.mapper;

import com.maco.universal.company.system.dto.item.ItemDto;
import com.maco.universal.company.system.entities.item.ItemEntity;
import org.mapstruct.Mapper;

@Mapper
public interface ItemMapper {
    ItemDto itemEntityToItemDto(ItemEntity itemEntity);
    ItemEntity itemDtoToItemEntity(ItemDto itemDto);
}
