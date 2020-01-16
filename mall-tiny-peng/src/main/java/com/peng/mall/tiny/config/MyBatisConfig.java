package com.peng.mall.tiny.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created by macro on 2019/4/8.
 */
@Configuration
@MapperScan({"com.peng.mall.tiny.mbg.mapper","com.peng.mall.tiny.dao"})
public class MyBatisConfig {
}
