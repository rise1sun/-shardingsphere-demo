package com.feng.mapper;

import com.feng.entity.OrderConfigDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jiangfeng
 * @date 2023/11/22
 */
// OrderConfigMapper.java

@Repository
public interface OrderConfigMapper {

    OrderConfigDO selectById(@Param("id") Integer id);

}