package com.pick.domain.service;

import com.pick.domain.document.ProductDocument;
import com.pick.domain.repository.ProductElasticRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@SpringBootTest
class ProductElasticServiceTest {

    @Mock
    private ProductElasticRepository productElasticRepository;

    @InjectMocks
    private ProductElasticService productElasticService;

    private ProductDocument document;

    @BeforeEach
    void setUp(){
        document = new ProductDocument(1L, "Test Document Product", 90000.0);
    }

    @Test
    void whenSaveProduct(){
        when(productElasticRepository.save(any(ProductDocument.class)))
                .thenReturn(document);
        ProductDocument saveDocument = productElasticService.save(new ProductDocument());
        assertNotNull(saveDocument);
        assertEquals("Test Document Product", saveDocument.getName());
    }

    @Test
    void whenGivenId_shouIdReturnProduct_ifFound(){
        when(productElasticRepository.findById(1L)).thenReturn(Optional.of(document));
        ProductDocument expected = productElasticService.findById(1L);
        assertNotNull(expected);
        assertEquals(expected, document);
    }

    @Test
    void whenGivenId_shouldDeleteProduct_ifFound(){
        Long productId = 1L;
        doNothing().when(productElasticRepository).deleteById(productId);
        productElasticService.delete(productId);
        verify(productElasticRepository, times(1)).deleteById(productId);
    }



}