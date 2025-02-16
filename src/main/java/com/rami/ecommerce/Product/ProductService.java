package com.rami.ecommerce.Product;

import java.sql.Timestamp;
import java.util.List;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

//VALIDAR SERVICE
@Service
@RequiredArgsConstructor
public class ProductService {

  private final ProductRepository productRepository;

  public List<ProductDTO> getAllProducts() {
    return productRepository.findAll()
        .stream()
        .map(
            product -> new ProductDTO(product.getId(), product.getName(), product.getDescription(), product.getPrice()))
        .toList();
  }

  public ProductDTO createProduct(ProductDTO dtoProduct) {
    Product product = new Product();
    product.setName(dtoProduct.name());
    product.setDescription(dtoProduct.description());
    product.setPrice(dtoProduct.price());
    product.setCreatedAt(new Timestamp(System.currentTimeMillis()));
    product.setUpdatedAt(new Timestamp(System.currentTimeMillis()));

    Product savedProduct = productRepository.save(product);
    return new ProductDTO(savedProduct.getId(), savedProduct.getName(), savedProduct.getDescription(),
        savedProduct.getPrice());
  }

}
