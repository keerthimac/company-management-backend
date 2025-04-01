package com.maco.universal.company.system.entities.machine;

import com.maco.universal.company.system.entities.employee.EmployeeEntity;
import com.maco.universal.company.system.entities.site.SiteEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "machine_transfer_sites")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MachineTransferSitesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "from_site_id", nullable = false)
    private SiteEntity fromSite;

    @ManyToOne
    @JoinColumn(name = "to_site_id", nullable = false)
    private SiteEntity toSite;

    @ManyToOne
    @JoinColumn(name = "machine_id", nullable = false)
    private MachineEntity machine;

    @ManyToOne
    @JoinColumn(name = "request_employee_id")
    private EmployeeEntity requestEmployee;

    @ManyToOne
    @JoinColumn(name = "receive_employee_id")
    private EmployeeEntity receiveEmployee;
}
