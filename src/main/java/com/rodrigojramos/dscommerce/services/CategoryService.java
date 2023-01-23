package com.rodrigojramos.dscommerce.services;

import com.rodrigojramos.dscommerce.dto.CategoryDTO;
import com.rodrigojramos.dscommerce.dto.ProductDTO;
import com.rodrigojramos.dscommerce.dto.ProductMinDTO;
import com.rodrigojramos.dscommerce.entities.Category;
import com.rodrigojramos.dscommerce.entities.Product;
import com.rodrigojramos.dscommerce.repositories.CategoryRepository;
import com.rodrigojramos.dscommerce.repositories.ProductRepository;
import com.rodrigojramos.dscommerce.services.exceptions.DatabaseException;
import com.rodrigojramos.dscommerce.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll() {
        List<Category> result = repository.findAll();
        return result.stream().map(x -> new CategoryDTO(x)).toList();
    }
}
