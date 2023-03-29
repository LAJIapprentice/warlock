package com.learn.kernel.admin.dao;

import com.learn.kernel.admin.entity.DatabaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 数据源表
 * 
 * @author warlock
 * @email warlock@gmail.com
 * @date 2023-03-20 21:01:55
 */
@Mapper
public interface DatabaseDao extends BaseMapper<DatabaseEntity> {
	
}
