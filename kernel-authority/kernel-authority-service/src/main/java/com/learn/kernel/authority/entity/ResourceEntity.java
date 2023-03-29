package com.learn.kernel.authority.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 后台资源表
 * 
 * @author warlock
 * @email warlock@email.com
 * @date 2023-03-20 21:32:05
 */
@Data
@TableName("auth_resource")
public class ResourceEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 资源名称
	 */
	private String resourceName;
	/**
	 * 资源URL
	 */
	private String resourceUrl;
	/**
	 * 描述
	 */
	private String resourceDescription;
	/**
	 * 资源分类ID
	 */
	private Long categoryId;
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
