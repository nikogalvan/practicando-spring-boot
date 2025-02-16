package com.rami.ecommerce.Product;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//VALIDAR ENTITY
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "products")
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String description;

  private Double price;
  @Temporal(TemporalType.TIMESTAMP)
  private Timestamp createdAt;

  @Temporal(TemporalType.TIMESTAMP)
  private Timestamp updatedAt;
}
