package com.rodrigojramos.dscommerce.repositories;

import com.rodrigojramos.dscommerce.entities.Order;
import com.rodrigojramos.dscommerce.entities.OrderItem;
import com.rodrigojramos.dscommerce.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
