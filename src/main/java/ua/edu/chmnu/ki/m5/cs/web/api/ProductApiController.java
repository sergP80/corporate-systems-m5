package ua.edu.chmnu.ki.m5.cs.web.api;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.chmnu.ki.m5.cs.delegate.ProductDelegate;
import ua.edu.chmnu.ki.m5.cs.web.dto.ProductDTO;

@RestController
@RequiredArgsConstructor
public class ProductApiController implements ProductApi {

    private final ProductDelegate delegate;

    @Override
    public ProductDTO getById(Long id) {
        return delegate.getById(id);
    }

    @Override
    public Page<ProductDTO> getAllBy(Pageable pageable) {
        return delegate.getAllBy(pageable);
    }

    @Override
    public ProductDTO create(ProductDTO product) {
        return delegate.create(product);
    }

    @Override
    public ProductDTO updateById(Long id, ProductDTO product) {
        return delegate.updateById(id, product);
    }

    @Override
    public void deleteById(Long id) {
        delegate.deleteById(id);
    }
}
