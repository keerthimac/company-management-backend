package com.maco.universal.company.system.entities.bill;

import com.maco.universal.company.system.entities.supplier.SupplierEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "bill")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BillEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    @OneToMany(mappedBy = "bill", cascade = CascadeType.ALL)
    private List<BillDetailEntity> details;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "supplier_id" , nullable = false)
    SupplierEntity supplier;

}
