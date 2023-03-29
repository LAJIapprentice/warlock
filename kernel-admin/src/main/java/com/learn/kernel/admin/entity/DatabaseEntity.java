package com.learn.kernel.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 数据源表
 * 
 * @author warlock
 * @email warlock@gmail.com
 * @date 2023-03-20 21:01:55
 */
@Data
@TableName("tab_database")
public class DatabaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 数据源名称
	 */
	private String databaseName;
	/**
	 * 数据源类型
	 */
	private String databaseType;
	/**
	 * 数据源版本
	 */
	private String databaseVersion;
	/**
	 * 数据源管理员
	 */
	private String databaseOwner;
	/**
	 * 数据源路径
	 */
	private String databaseUrl;
	/**
	 * 数据源端口
	 */
	private String databasePort;
	/**
	 * 数据源用户
	 */
	private String databaseUser;
	/**
	 * 数据源密码
	 */
	private String databasePassword;
	/**
	 * 目标端、源端
	 */
	private String location;
	/**
	 * 数据源描述
	 */
	private String databaseDescribe;
	/**
	 * 数据源地址
	 */
	private String address;
	/**
	 * JDBC类型
	 */
	private String connectPath;
	/**
	 * 连接类型
	 */
	private String connectType;

}
