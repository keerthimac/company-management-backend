package com.maco.universal.company.system.entities.machine;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
@Entity
@Table(name = "machine_type")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MachineTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 50)
    private String name;

    @OneToMany(mappedBy = "machineType")
    private Set<MachineEntity> machines;
}
