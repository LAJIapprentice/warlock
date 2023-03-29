package com.learn.kernel.authority.dao;

import com.learn.kernel.authority.entity.MenuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 后台菜单表
 * 
 * @author warlock
 * @email warlock@email.com
 * @date 2023-03-20 21:32:05
 */
@Mapper
public interface MenuDao extends BaseMapper<MenuEntity> {
	
}
