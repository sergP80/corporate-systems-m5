package ua.edu.chmnu.ki.m5.cs.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import ua.edu.chmnu.ki.m5.cs.persistence.entity.Product;
import ua.edu.chmnu.ki.m5.cs.web.dto.ProductDTO;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProductMapper {

    Product mapTo(ProductDTO source);

    ProductDTO mapFrom(Product source);
}
