package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author chengsikai
 * @email 122038601@qq.com
 * @date 2024-07-12 18:23:31
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
