package com.pick.application.controller;

import com.pick.domain.document.ProductDocument;
import com.pick.domain.service.ProductElasticService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProductDocumentController {

    private final ProductElasticService productElasticService;

    @GetMapping("/elastic/products")
    public Iterable<ProductDocument> list(){
        return productElasticService.findAll();
    }


}
