package com.maco.universal.company.system.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "supplier")
public class SupplierEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    String location;
    String contactInfo;
}
