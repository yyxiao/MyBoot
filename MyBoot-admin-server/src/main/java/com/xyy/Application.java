package com.xyy;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.apache.log4j.Logger;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Configuration;


/**
 * @Description spring-cloud eureka注册服务中心
 * @author Xander
 * @Date 2017/11/14 下午9:55
 * @see com.xyy
 * The word 'impossible' is not in my dictionary.
 */

@Configuration
@EnableAutoConfiguration
@EnableAdminServer
public class Application {
   private static Logger logger1 = Logger.getLogger(Application.class);

   /**
    * Main Start
    */
   public static void main(String[] args) {
       // 作用相同
       new SpringApplicationBuilder(Application.class).run(args);
       logger1.info("============= SpringBoot Start Success =============");
   }

}
