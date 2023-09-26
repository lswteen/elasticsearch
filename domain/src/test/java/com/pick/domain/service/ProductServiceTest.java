package com.pick.domain.service;

import com.pick.domain.entity.ProductEntity;
import com.pick.domain.repository.ProductRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@DataJpaTest
class ProductServiceTest {

    private final ProductRepository productRepository;
    private ProductEntity productEntity;

    ProductServiceTest(@Autowired ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @BeforeEach
    private void setup(){
        productEntity = productRepository.save(new ProductEntity(1L,"", 10000.0));
    }

    @Test
    void saveProduct(){
        System.out.println("Entity : "+productEntity.toString());
        Assertions.assertThat(productEntity.getProductId()).isOne();
    }

    @Test
    void findByProducts() {
        List<ProductEntity> results =  productRepository.findAll();
        Assertions.assertThat(results.size()).isEqualTo(20);
    }

    @Test
    void findByProductId() {
    }
}