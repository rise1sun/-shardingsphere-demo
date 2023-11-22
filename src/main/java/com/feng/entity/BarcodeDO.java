package com.feng.entity;

import lombok.*;
import org.apache.ibatis.type.JdbcType;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * 条码 DO
 *
 * @author 管理员
 */
@Data
public class BarcodeDO {

    /**
     * 条码id
     */
    private Long id;
    /**
     * 条码号
     */
    private Integer barcode;
    /**
     * 数据来源
     */
    private String dataSource;
    /**
     * 规格
     */
    private String spec;
    /**
     * 库区
     */
    private String area;
    /**
     * 库位
     */
    private String storage;
    /**
     * 条码状态
     *
     */
    private Byte barcodeStatus;
    /**
     * 当前工艺流程编号
     */
    private Integer formulaItemId;
    /**
     * ng点位
     */
    private String ngSite;
    /**
     * 复测记录标记
     */
    private Integer retest;
    /**
     * 工艺流程id
     */
    private Integer formulaId;
    /**
     * 托盘条码
     */
    private String trayId;
    /**
     * 通道号
     */
    private Integer channelIndex;
    /**
     * 批次id
     */
    private Integer batchId;
    /**
     * 关联电芯号
     */
    private Integer batteryId;
    /**
     * 设备名
     */
    private String cabName;
    /**
     * 是否锁定，0未锁定，1锁定
     */
    private Boolean isLocked;
    /**
     * MES生产订单号
     */
    private String mesProductionNumber;
    /**
     * 客户编号
     */
    private String customerNumber;
    /**
     * 备注
     */
    private String remark;

    private String batchName;

    private String formulaName;

    private String formulaItemName;

    private String bak01;

    private String bak02;

    private String bak03;

    private String oldTrayNo;


    /**
     * 创建时间
     */

    private Date createTime;
    /**
     * 最后更新时间
     */

    private Date updateTime;
    /**
     * 创建者，目前使用 SysUser 的 id 编号
     *
     * 使用 String 类型的原因是，未来可能会存在非数值的情况，留好拓展性。
     */
    private String creator;

    private String updater;
    /**
     * 是否删除
     */

    private Boolean deleted;
}
