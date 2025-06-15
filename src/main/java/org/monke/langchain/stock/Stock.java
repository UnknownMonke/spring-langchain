package org.monke.langchain.stock;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "stock_data")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length = 10, unique = true)
    private String ticker;

    @Column(name = "current_price_usd", nullable = false, precision = 10, scale = 2)
    private BigDecimal currentPriceUsd;

    @Column(name = "variation_last_10_days", precision = 5, scale = 2)
    private BigDecimal variationLast10Days;
}
