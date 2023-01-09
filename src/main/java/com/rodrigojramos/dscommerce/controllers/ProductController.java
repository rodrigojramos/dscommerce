package com.rodrigojramos.dscommerce.controllers;

import com.rodrigojramos.dscommerce.dto.ProductDTO;
import com.rodrigojramos.dscommerce.entities.Product;
import com.rodrigojramos.dscommerce.repositories.ProductRepository;
import com.rodrigojramos.dscommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping(value = "/{id}")
    public ProductDTO findById(@PathVariable Long id) {
        ProductDTO dto = service.findById(id);
        return dto;
    }
}
