package com.pick.domain.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Getter
@Document(indexName = "product_index")
@NoArgsConstructor
@AllArgsConstructor
public class ProductDocument {
    @Id
    private Long productId;
    private String name;
    private Double price;
}
