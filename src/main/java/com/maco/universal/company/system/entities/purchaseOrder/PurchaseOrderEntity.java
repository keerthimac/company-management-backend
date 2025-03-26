package com.maco.universal.company.system.entities.purchaseOrder;

import com.maco.universal.company.system.entities.bill.BillEntity;
import com.maco.universal.company.system.entities.employee.EmployeeEntity;
import com.maco.universal.company.system.entities.requestOrder.RequestOrderEntity;
import com.maco.universal.company.system.entities.supplier.SupplierEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "purchase_order")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseOrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    Date date;
    String status;
    Date expectedDelivery;
    @OneToMany(mappedBy = "purchaseOrder", cascade = CascadeType.ALL)
    List<PurchaseOrderDetailsEntity> purchaseOrderDetails;
    @OneToMany(mappedBy = "purchaseOrder", cascade = CascadeType.ALL)
    List<BillEntity> bills;
    @ManyToOne
    @JoinColumn(name = "supplier_id")
    SupplierEntity supplier;
    @ManyToOne
    @JoinColumn(name = "employee_id")
    EmployeeEntity employee;
    @ManyToOne
    @JoinColumn(name = "request_order_id")
    RequestOrderEntity requestOrder;
}
