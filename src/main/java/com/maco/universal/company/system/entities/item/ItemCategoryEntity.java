package com.maco.universal.company.system.entities.item;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "item_category")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemCategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String category;
    @OneToOne(mappedBy = "category")
    ItemEntity item;

}
