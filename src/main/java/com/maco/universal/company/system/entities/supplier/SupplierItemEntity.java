package com.maco.universal.company.system.entities.supplier;

import com.maco.universal.company.system.entities.item.ItemEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "supplier_item")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SupplierItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Double price;
    String code;
    Date priceEffectiveFrom;
    Date priceEffectiveTo;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "supplier_id" , nullable = false)
    SupplierEntity supplier;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id" , nullable = false)
    ItemEntity item;


}
