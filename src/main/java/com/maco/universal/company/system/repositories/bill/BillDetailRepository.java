package com.maco.universal.company.system.repositories.bill;

import com.maco.universal.company.system.entities.bill.BillDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillDetailRepository extends JpaRepository<BillDetailEntity, Integer> {
}