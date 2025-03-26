package com.maco.universal.company.system.repositories;

import com.maco.universal.company.system.entities.item.ItemCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemCategoryRepository extends JpaRepository<ItemCategoryEntity, Integer> {
}