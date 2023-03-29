package com.learn.kernel.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 任务组表
 * 
 * @author warlock
 * @email warlock@gmail.com
 * @date 2023-03-20 21:01:55
 */
@Data
@TableName("tab_task_group")
public class TaskGroupEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 组名称
	 */
	private String groupName;
	/**
	 * 组描述
	 */
	private String groupDescribe;
	/**
	 * 组管理员
	 */
	private String groupOwner;

}
