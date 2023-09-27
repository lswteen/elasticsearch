package com.pick.domain.repository;

import com.pick.domain.entity.ProductEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductElasticssearchRepository extends ElasticsearchRepository<ProductEntity,Long> {
}
