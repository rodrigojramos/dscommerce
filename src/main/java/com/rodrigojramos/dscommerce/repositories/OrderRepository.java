package com.rodrigojramos.dscommerce.repositories;

import com.rodrigojramos.dscommerce.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
