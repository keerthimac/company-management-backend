package com.maco.universal.company.system.repositories.requestOrder;

import com.maco.universal.company.system.entities.requestOrder.RequestOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestOrderRepository extends JpaRepository<RequestOrderEntity, Integer> {
}