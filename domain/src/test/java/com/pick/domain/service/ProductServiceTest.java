package com.pick.domain.service;

import com.pick.domain.entity.ProductEntity;
import com.pick.domain.repository.ProductDocumentRepository;
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
        //기존에 domain 모듈 > resources > sql/data.sql 19개 insert 에서 1개 추가 되면서 20개
        Assertions.assertThat(results.size()).isEqualTo(20);
    }

}