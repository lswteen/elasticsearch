package com.pick.product.request;

import lombok.*;

@Getter

@NoArgsConstructor
@EqualsAndHashCode(of = {"productId"})
public class ProductRequest {
    private Long productId;
    private String name;
    private Double price;

    @Builder
    public ProductRequest(Long productId, String name, Double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
}
