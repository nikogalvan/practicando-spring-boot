package com.rami.ecommerce.Product;

//VALIDAR DTO?
public record ProductDTO(
    Long id,
    String name,
    String description,
    Double price) {
}
