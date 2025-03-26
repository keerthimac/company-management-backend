package com.maco.universal.company.system.entities.supplier;

import com.maco.universal.company.system.entities.bill.BillEntity;
import com.maco.universal.company.system.entities.purchaseOrder.PurchaseOrderEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "supplier")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SupplierEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;
    String location;
    @Column(name = "contact_info")
    String contactInfo;
    @OneToMany(mappedBy = "supplier")
    List<SupplierItemEntity> items;
    @OneToMany(mappedBy = "supplier")
    List<BillEntity> bills;
    @OneToMany(mappedBy = "supplier",cascade = CascadeType.ALL)
    List<PurchaseOrderEntity> purchaseOrders;
}
