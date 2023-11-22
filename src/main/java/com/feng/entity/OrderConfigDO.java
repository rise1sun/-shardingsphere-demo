package com.feng.entity;

import lombok.Data;

/**
 *
 * @author jiangfeng
 * @date 2023/11/22
 */
@Data
public class OrderConfigDO {
    /**
     * 编号
     */
    private Integer id;
    /**
     * 支付超时时间
     *
     * 单位：分钟
     */
    private Integer payTimeout;
}
