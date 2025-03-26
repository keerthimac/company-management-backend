package com.maco.universal.company.system.repositories.supplier;

import com.maco.universal.company.system.entities.supplier.SupplierItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierItemRepository extends JpaRepository<SupplierItemEntity, Integer> {
}