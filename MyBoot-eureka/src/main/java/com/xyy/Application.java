package com.xyy;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


 /**
  * @Description spring-cloud eureka注册服务中心
  * @author Xander
  * @Date 2017/11/14 下午9:55
  * @see com.xyy
  * The word 'impossible' is not in my dictionary.
  */
@EnableEurekaServer
@SpringBootApplication
public class Application{
    private static Logger logger1 = Logger.getLogger(Application.class);

    /**
     * Main Start
     */
    public static void main(String[] args) {
        // 作用相同
//        SpringApplication.run(Application.class, args);
        new SpringApplicationBuilder(Application.class).web(true).run(args);
        logger1.info("============= SpringBoot Start Success =============");
    }

}
