package config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.google.common.collect.Lists;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import java.util.HashMap;
import java.util.Map;

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

    @ConfigurationProperties(prefix = "datasource.druid")
    @Bean(name = "datasource", initMethod = "init", destroyMethod = "close")
    public DruidDataSource getDataSource() {
        return new DruidDataSource();
    }

    @Bean
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(getDataSource());
    }

    // 指定环境下dev 开启监控
    @Bean
    @Profile("dev")
    public FilterRegistrationBean druidFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new WebStatFilter());
        Map<String, String> intParams = new HashMap<String, String>();
        intParams.put("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        registration.setName("DruidWebStatFilter");
        registration.setUrlPatterns(Lists.newArrayList("/*"));
        registration.setInitParameters(intParams);
        return registration;
    }

    //数据源监控
    @Bean
    @Profile("dev")
    public ServletRegistrationBean servletRegistrationBean() {
        ServletRegistrationBean registration = new ServletRegistrationBean();
        registration.setServlet(new StatViewServlet());
        registration.setName("druid");
        registration.setUrlMappings(Lists.newArrayList("/druid/*"));
        //自定义添加初始化参数
        Map<String, String> intParams = new HashMap<String, String>();
        intParams.put("loginUsername", "druid");
        intParams.put("loginPassword", "druid");
        registration.setName("DruidWebStatFilter");
        registration.setInitParameters(intParams);
        return registration;
    }
}