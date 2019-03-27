package com.yunus.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Author: gaoyunfeng
 * @date: 2019/3/27
 */
@Entity
@Table(name = "t_order")
@Data
public class Order implements Serializable {

    private static final long serialVersionUID = 661434701950670670L;

    @Id
    @Column(name = "order_id")
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderId;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "status")
    private String status;
}
