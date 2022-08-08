package com.meli.desafio_final.model;

import com.meli.desafio_final.model.enums.Category;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.lang.reflect.Type;

@Entity
@Data
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productId;

    @Column(nullable = false, unique = true)
    private String productName;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Category category;

    public Product(int i, String frango, Category frozen) {
        this.productId = i;
        this.productName = frango;
        this.category = frozen;
    }
}