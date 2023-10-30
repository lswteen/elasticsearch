package com.pick.domain.mapper;

import com.pick.domain.entity.ProductEntity;
import com.pick.product.request.ProductRequest;
import com.pick.product.response.ProductResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProductQueryMapper {
    ProductQueryMapper INSTANCE = Mappers.getMapper(ProductQueryMapper.class);
    List<ProductResponse> toProducts(List<ProductEntity> productEntityList);
    ProductResponse toResponse(ProductEntity productEntity);
    ProductEntity toRequest(ProductRequest productRequest);
}
