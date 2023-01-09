package com.rodrigojramos.dscommerce.repositories;

import com.rodrigojramos.dscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
