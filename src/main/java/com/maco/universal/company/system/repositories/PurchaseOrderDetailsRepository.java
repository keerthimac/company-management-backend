package com.maco.universal.company.system.repositories;

import com.maco.universal.company.system.entities.purchaseOrder.PurchaseOrderDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseOrderDetailsRepository extends JpaRepository<PurchaseOrderDetailsEntity, Integer> {
}