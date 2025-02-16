package com.rami.ecommerce.Product;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/v1/api/products")
@RequiredArgsConstructor
public class ProductController {

  private final ProductService productService;

  // VALIDAR CONTROLLER
  @PostMapping
  public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO dtoProduct) {
    return ResponseEntity
        .status(HttpStatus.CREATED)
        .body(productService.createProduct(dtoProduct));
  }

}
