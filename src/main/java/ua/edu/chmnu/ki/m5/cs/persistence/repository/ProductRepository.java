package ua.edu.chmnu.ki.m5.cs.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.edu.chmnu.ki.m5.cs.persistence.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
