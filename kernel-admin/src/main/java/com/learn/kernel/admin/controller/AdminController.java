package com.learn.kernel.admin.controller;

import com.learn.kernel.admin.service.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @Author: mi
 * @Date: 2023−02−09 20:30
 * @Description: 模块环境类
 */

@RestController
@Api("admin相关接口")
@RequestMapping("/admin/")
public class AdminController {

    @Resource
    private AdminService adminService;

    @GetMapping("/success")
    @ApiOperation("根据id查询用户的接口")
    public String success() {
        return "success";
    }


    @GetMapping("/env")
    @ApiOperation("根据id查询用户的接口")
    public Map<String, Object> envTest() {
        return adminService.adminService();
    }

}
