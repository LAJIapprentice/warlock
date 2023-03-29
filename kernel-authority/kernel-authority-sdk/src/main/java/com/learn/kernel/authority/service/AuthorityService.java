package com.learn.kernel.authority.service;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: mi
 * @Date: 2023−02−13 20:36
 * @Description: 权限服务env
 */
public interface AuthorityService {

    /**
     * Dubbo env测试
     *
     * @return Map
     */
    Map<String, Object> envService();
}
