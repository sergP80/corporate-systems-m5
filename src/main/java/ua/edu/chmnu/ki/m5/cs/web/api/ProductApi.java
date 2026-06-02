package ua.edu.chmnu.ki.m5.cs.web.api;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.edu.chmnu.ki.m5.cs.web.dto.ProductDTO;

@RequestMapping("/product")
@Validated
@Tag(name = "Product")
public interface ProductApi {

    @GetMapping("/{id}")
    ProductDTO getById(@PathVariable Long id);

    @GetMapping("/all")
    Page<ProductDTO> getAllBy(@PageableDefault(size = 20, sort = {"id"}, direction = Sort.Direction.DESC) Pageable pageable);

    @PostMapping
    ProductDTO create(@Valid @RequestBody ProductDTO product);

    @PutMapping("/{id}")
    ProductDTO updateById(@PathVariable Long id, @Valid @RequestBody ProductDTO product);

    @DeleteMapping("/{id}")
    void deleteById(@PathVariable Long id);
}
