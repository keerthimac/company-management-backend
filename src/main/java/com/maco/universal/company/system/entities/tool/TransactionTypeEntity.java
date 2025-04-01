package com.maco.universal.company.system.entities.tool;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "transaction_type")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransactionTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "type_name", nullable = false)
    private String typeName;

    @OneToMany(mappedBy = "transactionType")
    private Set<ToolTransactionEntity> toolTransactions;
}
