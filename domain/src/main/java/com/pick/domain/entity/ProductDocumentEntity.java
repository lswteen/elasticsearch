package com.pick.domain.entity;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.ToString;
import org.springframework.data.elasticsearch.annotations.Document;

@ToString
@Getter
@Document(indexName = "product_index")
public class ProductDocumentEntity {
    @Id
    private Long productId;
    private String name;
    private Double price;
}
