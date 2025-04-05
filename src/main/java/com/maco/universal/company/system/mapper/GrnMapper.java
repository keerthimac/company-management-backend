package com.maco.universal.company.system.mapper;

import com.maco.universal.company.system.dto.Grn.GrnDto;
import com.maco.universal.company.system.entities.grn.GrnEntity;
import org.mapstruct.Mapper;

@Mapper
public interface GrnMapper {
    GrnDto grnEntityToGrnDto(GrnEntity grnEntity);
    GrnEntity grnDtoToGrnEntity(GrnDto grnDto);
}
