package com.mut.cycle.domain.orders;

import com.mut.cycle.domain.enums.DeliveryConditions;
import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "orders_id")
    private Orders orders;

    private String invoiceNum;

    @Enumerated(EnumType.STRING)
    private DeliveryConditions conditions;
}