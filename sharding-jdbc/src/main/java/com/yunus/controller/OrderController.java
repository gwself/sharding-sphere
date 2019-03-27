package com.yunus.controller;

import com.yunus.entity.Order;
import com.yunus.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: gaoyunfeng
 * @date: 2019/3/27
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;


    @PostMapping
    public Order save(@RequestBody Order form) {
        return orderService.save(form);
    }

    @GetMapping
    public List<Order> list() {
        return orderService.list();
    }

    @GetMapping("/page")
    public Page<Order> page(@RequestParam("page") int page, @RequestParam("size") int size) {
        return orderService.listByPage(page, size);
    }
}
