package com.shucai.shucaimall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 */
@Configuration
@MapperScan({"com.shucai.shucaimall.mapper","com.shucai.shucaimall.dao"})
public class MyBatisConfig {
}
