package com.xyy;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Application
 * com.xyy
 *
 * @author Xander
 * Hystrix
 * @Date 2018-04-02 下午3:11
 * The word 'impossible' is not in my dictionary.
 */
@SpringBootApplication
@EnableEurekaClient
//@EnableTurbine
@EnableCircuitBreaker
@EnableHystrixDashboard
public class Application {

//    @RequestMapping("/")
//    public String home() {
//        return "forward:/hystrix";
//    }
    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }

}
