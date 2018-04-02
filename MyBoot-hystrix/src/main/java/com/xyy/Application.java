package com.xyy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.web.bind.annotation.RequestMapping;

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
@EnableTurbine
@EnableHystrixDashboard
public class Application {

    @RequestMapping("/")
    public String home() {
        return "forward:/hystrix";
    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
