package ua.edu.chmnu.ki.m5.cs.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ua.edu.chmnu.ki.m5.cs.persistence.entity.Product;
//CRUD
// Create
// Read
// Update
// Delete

public interface ProductService {

    Product getById(Long id);

    Page<Product> getAllBy(Pageable pageable);

    Product create(Product product);

    Product update(Long id, Product product);

    void delete(Long id);
}
