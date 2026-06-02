package ua.edu.chmnu.ki.m5.cs.delegate;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.edu.chmnu.ki.m5.cs.mapper.ProductMapper;
import ua.edu.chmnu.ki.m5.cs.persistence.entity.Product;
import ua.edu.chmnu.ki.m5.cs.service.ProductService;
import ua.edu.chmnu.ki.m5.cs.web.dto.ProductDTO;

@Service
@RequiredArgsConstructor
public class DefaultProductDelegate implements ProductDelegate {

    private final ProductService productService;

    private final ProductMapper productMapper;

    @Transactional(readOnly = true)
    @Override
    public ProductDTO getById(Long id) {

        Product product = productService.getById(id);

        return productMapper.mapFrom(product);
    }

    @Transactional(readOnly = true)
    @Override
    public Page<ProductDTO> getAllBy(Pageable pageable) {

        Page<Product> page = productService.getAllBy(pageable);

        return page.map(productMapper::mapFrom);
    }

    @Transactional
    @Override
    public ProductDTO create(ProductDTO product) {
        Product entity = productMapper.mapTo(product);

        entity = productService.create(entity);

        return productMapper.mapFrom(entity);
    }

    @Transactional
    @Override
    public ProductDTO updateById(Long id, ProductDTO product) {
        Product entity = productMapper.mapTo(product);

        entity = productService.update(id, entity);

        return productMapper.mapFrom(entity);
    }

    @Transactional
    @Override
    public void deleteById(Long id) {
        productService.delete(id);
    }
}
