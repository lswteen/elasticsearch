package com.pick.domain.service;

import com.pick.domain.entity.ProductEntity;
import com.pick.domain.mapper.ProductQueryMapper;
import com.pick.domain.repository.ProductRepository;
import com.pick.exception.ProductNotFoundException;
import com.pick.product.request.ProductRequest;
import com.pick.product.response.ProductResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductQueryMapper queryMapper = ProductQueryMapper.INSTANCE;

    @Transactional
    public ProductResponse saveProduct(ProductRequest productRequest){
        ProductEntity productEntity= productRepository.save(queryMapper.toRequest(productRequest));
        return queryMapper.toResponse(productEntity);
    }

    @Transactional(readOnly = true)
    public List<ProductResponse> findByProducts(){
        return queryMapper.toProducts(productRepository.findAll());
    }

    @Transactional(readOnly = true)
    public ProductResponse findByProductId(Long productId) {
        ProductEntity productEntity = productRepository.findById(productId)
                .orElseThrow(()-> new ProductNotFoundException(productId));
        return queryMapper.toResponse(productEntity);
    }
}
