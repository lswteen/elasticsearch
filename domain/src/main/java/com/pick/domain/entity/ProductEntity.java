package com.pick.domain.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Comment;

@Entity(name = "product")
@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ProductEntity {
    @Id
    @Column(name="product_id")
    @Comment("상품 ID")
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    @Comment("상품명")
    private String name;

    @Comment("상품가격")
    private Double price;

    public ProductEntity(Long productId, String name, Double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
}
