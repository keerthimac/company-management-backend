package com.maco.universal.company.system.entities.site;

import com.maco.universal.company.system.entities.employee.EmployeeEntity;
import com.maco.universal.company.system.entities.grn.GrnEntity;
import com.maco.universal.company.system.entities.requestOrder.RequestOrderEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Entity
@Table(name="site")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SiteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    String location;
    @OneToMany(mappedBy = "site")
    List<RequestOrderEntity> requestOrders;
    @OneToMany(mappedBy = "site")
    List<GrnEntity> grns;
    @ManyToMany(mappedBy = "sites")
    Set<EmployeeEntity> employees;
}
