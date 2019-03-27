package com.yunus.service;

import com.yunus.entity.Order;

import java.util.List;

/**
 * @Author: gaoyunfeng
 * @date: 2019/3/27
 */
public interface OrderService {

    /**
     * 获取所有订单
     *
     * @return
     */
    List<Order> list();

    /**
     * 新增订单
     *
     * @param form 订单表单
     * @return
     */
    Order save(Order form);
}
