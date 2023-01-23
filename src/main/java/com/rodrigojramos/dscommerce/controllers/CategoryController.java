package com.rodrigojramos.dscommerce.controllers;

import com.rodrigojramos.dscommerce.dto.CategoryDTO;
import com.rodrigojramos.dscommerce.dto.ProductDTO;
import com.rodrigojramos.dscommerce.dto.ProductMinDTO;
import com.rodrigojramos.dscommerce.services.CategoryService;
import com.rodrigojramos.dscommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {

    @Autowired
    private CategoryService service;

    @GetMapping
    public ResponseEntity<List<CategoryDTO>> findAll() {
        List<CategoryDTO> list = service.findAll();
        return ResponseEntity.ok(list);
    }
}
