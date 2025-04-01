package com.maco.universal.company.system.entities.machine;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "machine")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MachineEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "machine_type_id", nullable = false)
    private MachineTypeEntity machineType;

    @Column(length = 50)
    private String brand;

    @Column(name = "model_no", length = 50)
    private String modelNo;

    @Column(name = "purchase_date")
    private LocalDate purchaseDate;

    @Column(name = "purchase_value", precision = 10, scale = 2)
    private BigDecimal purchaseValue;

    @Column(name = "current_value", precision = 10, scale = 2)
    private BigDecimal currentValue;

    @ManyToOne
    @JoinColumn(name = "status_id", nullable = false)
    private MachineStatusEntity status;

    @OneToMany(mappedBy = "machine")
    private Set<SiteInventoryEntity> siteInventories;

    @OneToMany(mappedBy = "machine")
    private Set<MachineTransferSitesEntity> siteTransfers;

    @OneToMany(mappedBy = "machine")
    private Set<MachineTransferToLaborEntity> employeeTransfers;
}
