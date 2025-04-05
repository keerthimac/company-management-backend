package com.maco.universal.company.system.mapper;

import com.maco.universal.company.system.dto.site.SiteDto;
import com.maco.universal.company.system.entities.site.SiteEntity;
import org.mapstruct.Mapper;

@Mapper
public interface SiteMapper {
    SiteDto siteEntityToSiteDto(com.maco.universal.company.system.entities.site.SiteEntity siteEntity);
    SiteEntity siteDtoToSiteEntity(SiteDto siteDto);
}
