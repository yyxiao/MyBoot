package com.xyy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@EnableDiscoveryClient
@SpringBootApplication
public class NacosApplication {

	public static void main(String[] args) {
		SpringApplication.run(NacosApplication.class, args);
	}

	@Slf4j
	@RestController
	static class TestController {
		@GetMapping("/hello")
		public String hello(@RequestParam String name) {
			log.info("invoked name = " + name);
			return "hello " + name;
		}
	}

}

