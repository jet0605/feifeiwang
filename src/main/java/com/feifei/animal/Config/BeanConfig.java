package com.feifei.animal.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Configuration
public class BeanConfig {
//    @Bean(name = "multipartResolver")
//    public MultipartResolver multipartResolver(){
//        CommonsMultipartResolver resolver = new CommonsMultipartResolver();
//        resolver.setDefaultEncoding("UTF-8");
//        resolver.setMaxInMemorySize(40960);
//        resolver.setMaxUploadSize(50*1024);//上传文件大小 50kb 50*1024
//        resolver.setResolveLazily(true);//延迟文件解析
//        resolver.setUploadTempDir();
//        return resolver;
//    }
}
