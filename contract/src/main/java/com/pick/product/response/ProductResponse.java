package com.pick.product.response;

import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ProductResponse {
    private Long productId;
    private String name;
    private Double price;

    @Builder
    public ProductResponse(Long productId, String name, Double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
}
