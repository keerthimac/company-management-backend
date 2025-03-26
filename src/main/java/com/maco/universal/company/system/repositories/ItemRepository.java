package com.maco.universal.company.system.repositories;

import com.maco.universal.company.system.entities.item.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<ItemEntity, Integer> {
}