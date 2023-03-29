package com.learn.kernel.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author: mi
 * @Date: 2023−03−18 11:40
 * @Description: 基础类
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseEntity {
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
     * 创建时间
     */
    private Date updateTime;

    /**
     * 是否删除
     */
    private String delFlag;
}
