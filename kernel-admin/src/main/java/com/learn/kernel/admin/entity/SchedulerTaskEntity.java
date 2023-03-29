package com.learn.kernel.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 任务表
 * 
 * @author warlock
 * @email warlock@gmail.com
 * @date 2023-03-20 21:01:55
 */
@Data
@TableName("tab_scheduler_task")
public class SchedulerTaskEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 任务组Id
	 */
	private Long taskGroupId;
	/**
	 * 数据源目标端Id
	 */
	private Long databaseTargetId;
	/**
	 * 数据源源端Id
	 */
	private Long databaseSourceId;
	/**
	 * 目标端表
	 */
	private String tableTarget;
	/**
	 * 源端表
	 */
	private String tableSource;
	/**
	 * 是否创建表
	 */
	private String createTable;
	/**
	 * 调度名称
	 */
	private String schedulerName;
	/**
	 * sql、表迁移
	 */
	private String schedulerType;
	/**
	 * 调度描述
	 */
	private String schedulerDescribe;
	/**
	 * 调度状态
	 */
	private String schedulerStatus;
	/**
	 * 过滤条件
	 */
	private String filterCondition;
	/**
	 * 数据调度用户
	 */
	private String executeUser;
	/**
	 * 核心处理逻辑
	 */
	private String coreExecute;
	/**
	 * 前置sql
	 */
	private String prefixSql;
	/**
	 * 后置sql
	 */
	private String suffixSql;

}
