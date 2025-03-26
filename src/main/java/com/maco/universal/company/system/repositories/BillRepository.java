package com.maco.universal.company.system.repositories;

import com.maco.universal.company.system.entities.bill.BillEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<BillEntity, Integer> {
}