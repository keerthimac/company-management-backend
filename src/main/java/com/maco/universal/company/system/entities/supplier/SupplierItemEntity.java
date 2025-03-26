package com.maco.universal.company.system.entities.supplier;

import com.maco.universal.company.system.entities.bill.BillDetailEntity;
import com.maco.universal.company.system.entities.item.ItemEntity;
import com.maco.universal.company.system.entities.purchaseOrder.PurchaseOrderDetailsEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "supplier_item")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SupplierItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    Double price;
    String code;
    Date priceEffectiveFrom;
    Date priceEffectiveTo;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "supplier_id" , nullable = false)
    SupplierEntity supplier;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id" , nullable = false)
    ItemEntity item;
    @OneToMany(mappedBy = "supplierItem")
    List<BillDetailEntity> billDetails;
    @OneToMany(mappedBy = "supplierItem")
    List<PurchaseOrderDetailsEntity> purchaseOrderDetails;


}
