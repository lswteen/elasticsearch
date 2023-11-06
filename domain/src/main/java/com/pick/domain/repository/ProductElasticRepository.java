package com.pick.domain.repository;

import com.pick.domain.document.ProductDocument;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductElasticRepository extends ElasticsearchRepository<ProductDocument, Long> {
}
