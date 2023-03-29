package com.learn.kernel.authority.dao;

import com.learn.kernel.authority.entity.UserGroupEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户组表
 * 
 * @author warlock
 * @email warlock@email.com
 * @date 2023-03-20 21:32:05
 */
@Mapper
public interface UserGroupDao extends BaseMapper<UserGroupEntity> {
	
}
