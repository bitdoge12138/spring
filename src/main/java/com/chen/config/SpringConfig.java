package com.chen.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.chen")
@PropertySource("jdbc.properties")
@Import({JdbcConfig.class, MybatisConfig.class})
public class SpringConfig {

}
