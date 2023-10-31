package com.pick.domain.service;

import com.pick.domain.entity.ProductEntity;
import com.pick.domain.repository.ProductRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
class ProductServiceTest {

    private final ProductRepository productRepository;
    private ProductEntity productEntity;

    ProductServiceTest(@Autowired ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Test
    void findByProducts() {
        List<ProductEntity> results =  productRepository.findAll();
        //기존에 domain 모듈 > resources > sql/data.sql 19개
        Assertions.assertThat(results.size()).isEqualTo(19);
    }

}