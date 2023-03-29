package com.learn.kernel.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 任务历史表
 * 
 * @author warlock
 * @email warlock@gmail.com
 * @date 2023-03-20 21:01:55
 */
@Data
@TableName("tab_scheduler_history")
public class SchedulerHistoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 执行处理sql
	 */
	private String coreSql;
	/**
	 * 执行状态
	 */
	private String status;
	/**
	 * 调度数据量
	 */
	private String amount;
	/**
	 * 开始时间
	 */
	private String startTime;
	/**
	 * 开始时间
	 */
	private String endTime;
	/**
	 * 操作人
	 */
	private String operateUser;
	/**
	 * 执行日志
	 */
	private String operateLog;

}
