package com.hjj.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hjj.common.utils.PageUtils;
import com.hjj.gulimall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author hjj
 * @email 844642239@qq.com
 * @date 2023-03-21 21:41:27
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

