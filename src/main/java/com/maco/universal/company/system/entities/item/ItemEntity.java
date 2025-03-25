package com.maco.universal.company.system.entities.item;

import com.maco.universal.company.system.entities.requestOrder.RequestOrderDetailsEntity;
import com.maco.universal.company.system.entities.requestOrder.RequestOrderEntity;
import com.maco.universal.company.system.entities.supplier.SupplierItemEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "item")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String description;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    ItemCategoryEntity category;
    @OneToMany(mappedBy = "item")
    List<SupplierItemEntity> supplierItems;
    @OneToMany(mappedBy = "item")
    List<RequestOrderDetailsEntity> requestOrder;
}
