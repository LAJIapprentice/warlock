package com.learn.kernel.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: mi
 * @Date: 2023−02−09 20:43
 * @Description: swagger配置类
 */

@Configuration
@EnableOpenApi
public class SwaggerConfig {

    @Bean
    Docket docket() {
        return new Docket(DocumentationType.OAS_30)
                //配置网站的基本信息
                .apiInfo(new ApiInfoBuilder()
                        //网站标题
                        .title("warlock 接口文档")
                        //标题后面的版本号
                        .version("1.0.0")
                        .description("warlock项目接口文档")
                        //联系人信息
                        .contact(new Contact("kernel api center", "暂无", "930743086@qq.com"))
                        .build())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.learn.kernel.*.controller"))
                .paths(PathSelectors.regex("/error.*").negate())
                .paths(PathSelectors.any())
                .build();
    }

}
