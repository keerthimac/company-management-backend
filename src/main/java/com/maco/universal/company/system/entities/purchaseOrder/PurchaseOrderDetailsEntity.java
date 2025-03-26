package com.maco.universal.company.system.entities.purchaseOrder;

import com.maco.universal.company.system.entities.supplier.SupplierItemEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "purchase_order_details")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseOrderDetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    int quantity;
    @ManyToOne
    @JoinColumn(name = "purchase_order_id",nullable = false)
    PurchaseOrderEntity purchaseOrder;
    @ManyToOne
    @JoinColumn(name = "supplier_item_id",nullable = false)
    SupplierItemEntity supplierItem;
}
