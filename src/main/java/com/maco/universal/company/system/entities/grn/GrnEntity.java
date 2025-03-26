package com.maco.universal.company.system.entities.grn;

import com.maco.universal.company.system.entities.bill.BillEntity;
import com.maco.universal.company.system.entities.employee.EmployeeEntity;
import com.maco.universal.company.system.entities.purchaseOrder.PurchaseOrderEntity;
import com.maco.universal.company.system.entities.requestOrder.RequestOrderEntity;
import com.maco.universal.company.system.entities.site.SiteEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "good_receive_notice")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GrnEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String grnNo;
    String comments;
    @ManyToOne
    @JoinColumn(name = "purchase_order_id")
    PurchaseOrderEntity purchaseOrder;
    @ManyToOne
    @JoinColumn(name = "employee_id")
    EmployeeEntity employee;
    @ManyToOne
    @JoinColumn(name = "site_id")
    SiteEntity site;
    @OneToOne
    @JoinColumn(name = "bill_id")
    BillEntity bill;
    @ManyToOne
    @JoinColumn(name = "supplier_id")
    RequestOrderEntity requestOrder;
}
