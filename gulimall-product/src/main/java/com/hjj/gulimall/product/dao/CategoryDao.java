package com.hjj.gulimall.product.dao;

import com.hjj.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author hjj
 * @email 844642239@qq.com
 * @date 2023-03-21 21:41:27
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
