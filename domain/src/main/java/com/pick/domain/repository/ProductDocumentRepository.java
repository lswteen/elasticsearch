package com.pick.domain.repository;

import com.pick.domain.entity.ProductDocumentEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDocumentRepository extends ElasticsearchRepository<ProductDocumentEntity,Long> {
}
