package com.maco.universal.company.system.repositories;

import com.maco.universal.company.system.entities.site.SiteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SiteRepository extends JpaRepository<SiteEntity, Integer> {
}