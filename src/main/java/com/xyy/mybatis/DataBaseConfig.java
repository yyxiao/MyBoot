package com.xyy.mybatis;

import com.alibaba.druid.pool.DruidDataSource;
import org.slf4j.LoggerFactory;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;


/**
 * DataBaseConfig
 * mybatis
 *
 * @author xiaoyy
 *         获取数据库连接配置信息
 * @Date 2017-05-07 下午2:06
 * The word 'impossible' is not in my dictionary.
 */
@Configuration
@EnableTransactionManagement
public class DataBaseConfig implements EnvironmentAware {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(DataBaseConfig.class);

    /*
    Spring Boot支持从多个地方加载配置，比如命令行、系统环境变量、JNDI等，因此配置项的语法支持所谓的RelaxedEnvironment。
    在源码中，通过查找 Relaxed开头的类，比如RelaxedPropertyResolver，可以了解到相关的使用情况
     */
    private RelaxedPropertyResolver propertyResolver;

    public void setEnvironment(Environment environment) {
        this.propertyResolver = new RelaxedPropertyResolver(environment, "jdbc.");
    }

    @Bean(name = "writeDataSource", destroyMethod = "close", initMethod = "init")
    @Primary
    public DataSource writeDataSource() {
        logger.debug("Configruing Write DataSource");

        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(propertyResolver.getProperty("mysql.url"));
        dataSource.setDriverClassName(propertyResolver.getProperty("mysql.driverName"));
        dataSource.setUsername(propertyResolver.getProperty("mysql.username"));
        dataSource.setPassword(propertyResolver.getProperty("mysql.password"));

        return dataSource;
    }

    @Bean(name = "readOneDataSource", destroyMethod = "close", initMethod = "init")
    public DataSource readOneDataSource() {
        logger.debug("Configruing Read One DataSource");

        DruidDataSource datasource = new DruidDataSource();
        datasource.setUrl(propertyResolver.getProperty("url"));
        datasource.setDriverClassName(propertyResolver.getProperty("driverClassName"));
        datasource.setUsername(propertyResolver.getProperty("username"));
        datasource.setPassword(propertyResolver.getProperty("password"));

        return datasource;
    }

    @Bean(name = "readTowDataSource", destroyMethod = "close", initMethod = "init")
    public DataSource readTowDataSource() {
        logger.debug("Configruing Read Two DataSource");

        DruidDataSource datasource = new DruidDataSource();
        datasource.setUrl(propertyResolver.getProperty("url"));
        datasource.setDriverClassName(propertyResolver.getProperty("driverClassName"));
        datasource.setUsername(propertyResolver.getProperty("username"));
        datasource.setPassword(propertyResolver.getProperty("password"));

        return datasource;
    }

    @Bean(name = "readDataSources")
    public List<DataSource> readDataSources() {
        List<DataSource> dataSources = new ArrayList<DataSource>();
        dataSources.add(readOneDataSource());
        dataSources.add(readTowDataSource());
        return dataSources;
    }

}
