package com.yunus.repository;

import com.yunus.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: gaoyunfeng
 * @date: 2019/3/27
 */
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
