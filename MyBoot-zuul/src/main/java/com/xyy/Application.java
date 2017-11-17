package com.xyy;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;


/**
 * @Description spring-cloud eureka注册服务中心
 * @author Xander
 * @Date 2017/11/17 下午9:55
 * @see com.xyy
 * The word 'impossible' is not in my dictionary.
 */
@EnableZuulProxy
@SpringBootApplication
public class Application {
   private static Logger logger = Logger.getLogger(Application.class);

   /**
    * Main Start
    */
   public static void main(String[] args) {
       SpringApplication.run(Application.class, args);
       logger.info("============= MyBoot-zuul Start Success =============");
   }

    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }

}
