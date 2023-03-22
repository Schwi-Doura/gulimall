package com.hjj.gulimall.member.dao;

import com.hjj.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author hjj
 * @email 844642239@qq.com
 * @date 2023-03-22 23:17:56
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
