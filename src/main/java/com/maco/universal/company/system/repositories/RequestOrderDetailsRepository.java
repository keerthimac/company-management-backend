package com.maco.universal.company.system.repositories;

import com.maco.universal.company.system.entities.requestOrder.RequestOrderDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestOrderDetailsRepository extends JpaRepository<RequestOrderDetailsEntity, Integer> {
}