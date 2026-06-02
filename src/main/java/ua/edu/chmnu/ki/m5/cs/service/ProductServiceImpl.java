package ua.edu.chmnu.ki.m5.cs.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ua.edu.chmnu.ki.m5.cs.exceptions.ProductNotFoundException;
import ua.edu.chmnu.ki.m5.cs.persistence.entity.Product;
import ua.edu.chmnu.ki.m5.cs.persistence.repository.ProductRepository;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public Product getById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product with ID:" + id + " not found"));
    }

    @Override
    public Page<Product> getAllBy(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public Product create(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product update(Long id, Product product) {
        if (!productRepository.existsById(id)) {
            throw new ProductNotFoundException("Product with ID:" + id + " not found to update");
        }

        product.setId(id);

        return productRepository.save(product);
    }

    @Override
    public void delete(Long id) {
        if (!productRepository.existsById(id)) {
            throw new ProductNotFoundException("Product with ID:" + id + " not found to delete");
        }

        productRepository.deleteById(id);
    }
}
