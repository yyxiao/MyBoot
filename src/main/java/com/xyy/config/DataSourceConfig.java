package com.xyy.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import java.beans.PropertyVetoException;

/**
 * DataSourceConfig
 * config
 *
 * @author xiaoyy
 *         Druid数据源配置并添加sql监控：
 * @Date 2017-05-18 下午1:48
 * The word 'impossible' is not in my dictionary.
 */
@Configuration
public class DataSourceConfig {
    @Autowired
    private Environment env;

    @Bean(name="dataSource")
    public DruidDataSource dataSource() throws PropertyVetoException {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(env.getProperty("db.driverClassName"));
        dataSource.setUrl(env.getProperty("db.url"));
        dataSource.setUsername(env.getProperty("db.username"));
        dataSource.setPassword(env.getProperty("db.password"));
        return dataSource;
    }
}