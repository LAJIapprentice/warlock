package com.learn.kernel.authority.service;

import org.apache.dubbo.config.annotation.DubboService;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: mi
 * @Date: 2023−03−05 21:37
 * @Description: AuthorityService
 */

@DubboService(version = "1.0")
public class AuthorityServiceImpl implements AuthorityService{

    @Override
    public Map<String, Object> envService() {
        Map<String,Object> envMap = new HashMap<>();
        envMap.put("status","success");
        envMap.put("code","200");
        return envMap;
    }
}
