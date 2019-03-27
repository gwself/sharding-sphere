package com.yunus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.transaction.jta.JtaAutoConfiguration;

/**
 * @Author: gaoyunfeng
 * @date: 2019/3/26
 */
@EntityScan(basePackages = "com.yunus.entity")
@SpringBootApplication(exclude = {JtaAutoConfiguration.class})
public class ShardingJdbcBootStrap {

    public static void main(String[] args) {
        SpringApplication.run(ShardingJdbcBootStrap.class, args);
    }

}
