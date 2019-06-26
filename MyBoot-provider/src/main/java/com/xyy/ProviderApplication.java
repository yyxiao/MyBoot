package com.xyy;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.beans.PropertyVetoException;

/**
 * Application
 * PACKAGE_NAME
 *
 * @author xiaoyy
 *         主函数，包含main函数
 * @Date 2017-05-17 上午10:39
 * The word 'impossible' is not in my dictionary.
 */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.xyy.mapper")
public class ProviderApplication extends SpringBootServletInitializer {
    private static Logger logger = LoggerFactory.getLogger(ProviderApplication.class);
    @Autowired
    private Environment env;

    @Bean(name = "dataSource")
    public DruidDataSource dataSource() throws PropertyVetoException {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(env.getProperty("db.driverClassName"));
        dataSource.setUrl(env.getProperty("db.url"));
        dataSource.setUsername(env.getProperty("db.username"));
        dataSource.setPassword(env.getProperty("db.password"));
        String a = env.getProperty("db.password");
        System.out.println(a);
        return dataSource;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath*:mapper/*.xml"));
        return sqlSessionFactoryBean.getObject();
    }

    @Bean(name = "transactionManager")
    public PlatformTransactionManager annotationDrivenTransactionManager() throws PropertyVetoException {
        return new DataSourceTransactionManager(dataSource());
    }


    /**
     * @Description 重写configure，相当于web.xml加载main
     * @author Xander
     * @Date 2017/10/26 下午3:43
     * The word 'impossible' is not in my dictionary.
     */
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(Application.class);
//    }

    /**
     * Main Start
     */
    public static void main(String[] args) {
//        new SpringApplicationBuilder(Application.class).web(true).run(args);
        SpringApplication.run(ProviderApplication.class, args);
        logger.info("============= SpringBoot Start Success =============");
    }


    /**
     * 捕获类内所有的异常
     *
     * @param ex
     * @return
     */
    @ExceptionHandler
    public ModelAndView exceptionHandelByThymeleaf(Exception ex, HttpServletRequest req) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("error");
        mav.addObject("exception", ex);
        mav.addObject("url", req.getRequestURL());
        return mav;
    }
}
