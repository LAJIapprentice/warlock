package com.learn.kernel.authority.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 后台用户登录日志表
 * 
 * @author warlock
 * @email warlock@email.com
 * @date 2023-03-20 21:32:05
 */
@Data
@TableName("auth_user_login_log")
public class UserLoginLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private Long userId;
	/**
	 * 
	 */
	private String ip;
	/**
	 * 
	 */
	private String address;
	/**
	 * 浏览器登录类型
	 */
	private String userAgent;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 删除标志
	 */
	private Integer delFlag;

}
