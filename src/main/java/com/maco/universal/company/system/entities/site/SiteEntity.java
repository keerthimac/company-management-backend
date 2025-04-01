package com.maco.universal.company.system.entities.site;

import com.maco.universal.company.system.entities.tool.ToolTransactionEntity;
import com.maco.universal.company.system.entities.tool.ToolsInventory;
import com.maco.universal.company.system.entities.employee.EmployeeEntity;
import com.maco.universal.company.system.entities.machine.MachineTransferSitesEntity;
import com.maco.universal.company.system.entities.machine.SiteInventoryEntity;
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
    Integer id;
    String name;
    String location;

    @OneToMany(mappedBy = "site")
    List<RequestOrderEntity> requestOrders;

    @OneToMany(mappedBy = "site")
    List<GrnEntity> grns;

    @ManyToMany(mappedBy = "sites")
    Set<EmployeeEntity> employees;

    @OneToMany(mappedBy = "site")
    private Set<ToolsInventory> toolsInventories;

    @OneToMany(mappedBy = "site")
    private Set<ToolTransactionEntity> toolTransactions;

    @OneToMany(mappedBy = "site")
    private Set<SiteInventoryEntity> siteInventories;

    @OneToMany(mappedBy = "fromSite")
    private Set<MachineTransferSitesEntity> outgoingTransfers;

    @OneToMany(mappedBy = "toSite")
    private Set<MachineTransferSitesEntity> incomingTransfers;
}
