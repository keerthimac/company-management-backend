package com.maco.universal.company.system.repositories;

import com.maco.universal.company.system.entities.purchaseOrder.PurchaseOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrderEntity, Integer> {
}