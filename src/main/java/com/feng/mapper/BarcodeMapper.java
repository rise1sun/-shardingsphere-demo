package com.feng.mapper;

import com.feng.entity.BarcodeDO;
import com.feng.entity.OrderDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * @author jiangfeng
 * @date 2023/11/22
 */
@Repository
public interface BarcodeMapper {

    BarcodeDO selectById(@Param("id") Integer id);

    List<BarcodeDO> selectListByBarcode(Integer barcode);

    void insert(BarcodeDO barcodeDO);

    List<BarcodeDO> selectListByTime();

    Boolean updateDataSource(String dataSource);
}
