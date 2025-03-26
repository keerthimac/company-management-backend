package com.maco.universal.company.system.repositories.supplier;

import com.maco.universal.company.system.entities.supplier.SupplierEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<SupplierEntity, Integer> {
}
