package com.learn.kernel.authority.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 后台菜单表
 * 
 * @author warlock
 * @email warlock@email.com
 * @date 2023-03-20 21:32:05
 */
@Data
@TableName("auth_menu")
public class MenuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 父级ID
	 */
	private Long parentId;
	/**
	 * 菜单名称
	 */
	private String title;
	/**
	 * 菜单级数
	 */
	private Integer menuLevel;
	/**
	 * 菜单排序
	 */
	private Integer sort;
	/**
	 * 前端名称
	 */
	private String menuName;
	/**
	 * 前端图标
	 */
	private String icon;
	/**
	 * 前端隐藏
	 */
	private Integer hidden;
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
