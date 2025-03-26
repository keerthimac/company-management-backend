package com.maco.universal.company.system.entities.requestOrder;
import com.maco.universal.company.system.entities.employee.EmployeeEntity;
import com.maco.universal.company.system.entities.grn.GrnEntity;
import com.maco.universal.company.system.entities.purchaseOrder.PurchaseOrderEntity;
import com.maco.universal.company.system.entities.site.SiteEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="request_order")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestOrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    Date date;
    @ManyToOne
    @JoinColumn(name = "employee_id",nullable = false)
    EmployeeEntity employee;
    @ManyToOne
    @JoinColumn(name = "site_id",nullable = false)
    SiteEntity site;
    @OneToMany(mappedBy = "requestOrder")
    List<PurchaseOrderEntity> purchaseOrders;
    @OneToMany(mappedBy = "requestOrder")
    List<GrnEntity> grns;
    @OneToMany(mappedBy = "requestOrder")
    List<RequestOrderDetailsEntity> requestOrderDetails;
}
