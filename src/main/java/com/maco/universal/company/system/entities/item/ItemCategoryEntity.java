package com.maco.universal.company.system.entities.item;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "item_category")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemCategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String category;
    @OneToMany(mappedBy = "category")
    List<ItemEntity> item;

}
