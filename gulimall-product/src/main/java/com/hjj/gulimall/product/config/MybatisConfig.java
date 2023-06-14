package com.hjj.gulimall.product.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@MapperScan("com.hjj.gulimall.product.dao")
public class MybatisConfig {
    /*分页插件*/
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        //设置请求页面大于最后页的操作，true回到首页，false继续请求
        paginationInterceptor.setOverflow(true);
        //每页最大限制数量
        paginationInterceptor.setLimit(1000);
        return paginationInterceptor;
    }
}
