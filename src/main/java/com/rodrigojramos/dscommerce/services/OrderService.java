package com.rodrigojramos.dscommerce.services;

import com.rodrigojramos.dscommerce.dto.OrderDTO;
import com.rodrigojramos.dscommerce.dto.ProductDTO;
import com.rodrigojramos.dscommerce.entities.Order;
import com.rodrigojramos.dscommerce.entities.Product;
import com.rodrigojramos.dscommerce.repositories.OrderRepository;
import com.rodrigojramos.dscommerce.repositories.ProductRepository;
import com.rodrigojramos.dscommerce.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Transactional(readOnly = true)
    public OrderDTO findById(Long id) {
        Order order = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Recurso não encontrado"));
        return new OrderDTO(order);
    }
}
