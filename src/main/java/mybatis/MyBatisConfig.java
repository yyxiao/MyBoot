package mybatis;

import org.apache.log4j.Logger;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * MyBatisConfig
 * mybatis
 *
 * @author xiaoyy
 * myBatis配置类
 * @Date 2017-05-08 下午1:53
 * The word 'impossible' is not in my dictionary.
 */
@Configuration
public class MyBatisConfig implements EnvironmentAware{

    private static Logger logger = Logger.getLogger(MyBatisConfig.class);

    private RelaxedPropertyResolver propertyResolver;

    public void setEnvironment(Environment environment) {

    }
}
