package com.pick.domain.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Getter
@Document(indexName = "product-index")
@NoArgsConstructor
@AllArgsConstructor
public class ProductDocument {
    @Id
    private Long productId;
    @Field(name = "name", type = FieldType.Text)
    private String name;
    @Field(name = "price", type = FieldType.Double)
    private Double price;
}
