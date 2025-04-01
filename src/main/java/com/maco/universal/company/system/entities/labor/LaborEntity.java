package com.maco.universal.company.system.entities.labor;

import com.maco.universal.company.system.entities.machine.MachineTransferToLaborEntity;
import com.maco.universal.company.system.entities.tool.ToolTransactionEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "labor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LaborEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false, length = 50,name = "id_number")
    private String idNumber;

    @OneToMany(mappedBy = "labor")
    private Set<ToolTransactionEntity> toolTransactions;

    @OneToMany(mappedBy = "receiveLabor")
    private Set<MachineTransferToLaborEntity> receivedMachineTransfers;
}
