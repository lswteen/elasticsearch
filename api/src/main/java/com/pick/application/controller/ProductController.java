package com.pick.application.controller;

import com.pick.domain.service.ProductService;
import com.pick.product.request.ProductRequest;
import com.pick.product.response.ProductResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Tag(name = "Product", description = "Product 기능을 제공합니다.")
public class ProductController {

    private final ProductService productService;

    @Operation(
        summary = "상품",
        description = "상품정보 조회 기능을 제공합니다."
    )
    @GetMapping("/products")
    public List<ProductResponse> products(){
        return productService.findByProducts();
    }

    @PostMapping("/product")
    public ProductResponse createProduct(@RequestBody ProductRequest productRequest){
        return productService.saveProduct(productRequest);
    }
}
