package com.feng.entity;

import lombok.Data;

/**
 *
 * @author jiangfeng
 * @date 2023/11/22
 */
@Data
public class OrderDO {
    /**
     * 订单编号
     */
    private Long id;
    /**
     * 用户编号
     */
    private Integer userId;
}
