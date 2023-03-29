package com.learn.kernel.authority.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 后台用户权限表
 * 
 * @author warlock
 * @email warlock@email.com
 * @date 2023-03-20 21:32:05
 */
@Data
@TableName("auth_permission")
public class PermissionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 父级权限id
	 */
	private Long pid;
	/**
	 * 名称
	 */
	private String permissionName;
	/**
	 * 权限值
	 */
	private String permissionValue;
	/**
	 * 图标
	 */
	private String icon;
	/**
	 * 权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）
	 */
	private Integer type;
	/**
	 * 前端资源路径
	 */
	private String uri;
	/**
	 * 启用状态
	 */
	private Integer permissionStatus;
	/**
	 * 排序
	 */
	private Integer sort;
	/**
	 * 创建人
	 */
	private String createBy;
	/**
	 * 更新人
	 */
	private String lastUpdateBy;
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
