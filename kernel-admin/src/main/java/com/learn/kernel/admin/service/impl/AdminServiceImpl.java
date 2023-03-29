package com.learn.kernel.admin.service.impl;

import com.learn.kernel.admin.service.AdminService;
import com.learn.kernel.authority.service.AuthorityService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Author: mi
 * @Date: 2023−02−13 20:50
 * @Description: AdminService
 */

@Service
public class AdminServiceImpl implements AdminService {

    @DubboReference(version = "1.0")
    private AuthorityService authorityService;

    @Override
    public Map<String, Object> adminService() {
        return authorityService.envService();
    }
}
