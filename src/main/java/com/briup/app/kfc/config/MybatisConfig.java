package com.briup.app.kfc.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.briup.app.kfc.mapper")
public class MybatisConfig {

}
