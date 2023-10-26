package com.pick.domain.service;

import com.pick.domain.entity.ProductEntity;
import com.pick.domain.repository.ProductRepository;
import com.pick.exception.ProductNotFoundException;
import com.pick.product.request.ProductRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public ProductEntity saveProduct(ProductEntity entity){
        return productRepository.save(entity);
    }

    @Transactional(readOnly = true)
    public List<ProductEntity> findByProducts(){
        return productRepository.findAll();
    }

    @Transactional(readOnly = true)
    public ProductEntity findByProductId(Long productId) {
        return productRepository.findById(productId)
                .orElseThrow(()-> new ProductNotFoundException(productId));
    }
}
