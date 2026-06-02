package ua.edu.chmnu.ki.m5.cs.delegate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ua.edu.chmnu.ki.m5.cs.web.dto.ProductDTO;

public interface ProductDelegate {
    ProductDTO getById(Long id);

    Page<ProductDTO> getAllBy(Pageable pageable);

    ProductDTO create(ProductDTO product);

    ProductDTO updateById(Long id, ProductDTO product);

    void deleteById(Long id);
}
