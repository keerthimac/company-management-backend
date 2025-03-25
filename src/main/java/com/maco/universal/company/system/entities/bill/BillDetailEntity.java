package com.maco.universal.company.system.entities.bill;

import com.maco.universal.company.system.entities.supplier.SupplierItemEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "bill_details")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BillDetailEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    int quantity;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bill_id" , nullable = false)
    BillEntity bill;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="sup_item_id",nullable = false)
    SupplierItemEntity supplierItem;
}
