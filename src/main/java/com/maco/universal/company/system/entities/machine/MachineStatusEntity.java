package com.maco.universal.company.system.entities.machine;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "machine_status")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MachineStatusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "status_name", nullable = false)
    private String statusName;

    @OneToMany(mappedBy = "status")
    private Set<MachineEntity> machines;
}
