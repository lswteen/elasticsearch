package com.pick.domain.service;

import com.pick.domain.document.ProductDocument;
import com.pick.domain.repository.ProductElasticRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductElasticService {
    private final ProductElasticRepository productElasticRepository;

    public Iterable<ProductDocument> findAll(){
        return productElasticRepository.findAll();
    }

    public ProductDocument findById(Long productId){
        return productElasticRepository.findById(productId).orElse(null);
    }

    public ProductDocument save(ProductDocument document){
        return productElasticRepository.save(document);
    }

    public void delete(Long productId){
        productElasticRepository.deleteById(productId);
    }


}
