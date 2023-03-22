package com.hjj.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hjj.common.utils.PageUtils;
import com.hjj.gulimall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author hjj
 * @email 844642239@qq.com
 * @date 2023-03-22 23:03:14
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

