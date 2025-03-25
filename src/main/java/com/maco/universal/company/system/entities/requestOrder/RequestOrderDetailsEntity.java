package com.maco.universal.company.system.entities.requestOrder;

import com.maco.universal.company.system.entities.item.ItemEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name ="request_order_detail")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestOrderDetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String priority;
    Double quantity;
    @ManyToOne
    @JoinColumn(name = "request_order_id")
    RequestOrderEntity requestOrder;
    @ManyToOne
    @JoinColumn(name ="item_id")
    ItemEntity item;



}
