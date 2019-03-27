package com.yunus.service;

import com.yunus.entity.Order;
import com.yunus.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: gaoyunfeng
 * @date: 2019/3/27
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> list() {
        return orderRepository.findAll();
    }

    public Page<Order> listByPage(int page, int size) {
        return orderRepository.findAll(PageRequest.of(page, size));
    }

    public Order save(Order form) {
        orderRepository.save(form);
        return form;
    }
}
