package com.maco.universal.company.system.repositories.grn;

import com.maco.universal.company.system.entities.grn.GrnEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GrnRepository extends JpaRepository<GrnEntity, Integer> {
}