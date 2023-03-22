package com.hjj.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hjj.common.utils.PageUtils;
import com.hjj.gulimall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author hjj
 * @email 844642239@qq.com
 * @date 2023-03-22 23:03:13
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

