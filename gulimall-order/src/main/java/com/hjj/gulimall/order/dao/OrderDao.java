package com.hjj.gulimall.order.dao;

import com.hjj.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author hjj
 * @email 844642239@qq.com
 * @date 2023-03-22 23:26:28
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
