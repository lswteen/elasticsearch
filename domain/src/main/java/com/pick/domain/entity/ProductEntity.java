package com.pick.domain.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Comment;

@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name="product")
public class ProductEntity {

    @Id
    @Column(name="product_id")
    @Comment("상품 ID")
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
