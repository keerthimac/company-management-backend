package com.maco.universal.company.system.entities.employee;

import com.maco.universal.company.system.entities.bill.BillEntity;
import com.maco.universal.company.system.entities.grn.GrnEntity;
import com.maco.universal.company.system.entities.purchaseOrder.PurchaseOrderEntity;
import com.maco.universal.company.system.entities.requestOrder.RequestOrderEntity;
import com.maco.universal.company.system.entities.site.SiteEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "employee")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;
    String position;
    String contactInfo;
    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    List<BillEntity> bills;
    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    List<PurchaseOrderEntity> purchaseOrders;
    @OneToMany(mappedBy = "employee")
    List<RequestOrderEntity> requestOrders;
    @OneToMany(mappedBy = "employee")
    List<GrnEntity> grns;
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "employee_site",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "site_id")
    )
    Set<SiteEntity> sites;
}
