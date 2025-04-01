package com.maco.universal.company.system.entities.machine;

import com.maco.universal.company.system.entities.employee.EmployeeEntity;
import com.maco.universal.company.system.entities.labor.LaborEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "machine_transfer_labor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MachineTransferToLaborEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "machine_receive_date", nullable = false)
    private LocalDate machineReceiveDate;

    @Column(name = "machine_handover_date", nullable = false)
    private LocalDate machineHandoverDate;

    @ManyToOne
    @JoinColumn(name = "from_employee_id", nullable = false)
    private EmployeeEntity fromEmployee;

    @ManyToOne
    @JoinColumn(name = "receive_labor_id", nullable = false)
    private LaborEntity receiveLabor;

    @ManyToOne
    @JoinColumn(name = "machine_id", nullable = false)
    private MachineEntity machine;
}
