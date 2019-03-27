package com.yunus.repository;

import com.yunus.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: gaoyunfeng
 * @date: 2019/3/27
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
