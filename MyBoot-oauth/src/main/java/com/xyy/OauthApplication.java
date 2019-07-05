package com.xyy;

import org.apache.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.xyy.entity"})
@EnableJpaRepositories(basePackages = {"com.xyy.dao"})
public class OauthApplication implements CommandLineRunner {
	private static Logger logger = Logger.getLogger(OauthApplication.class);

	public static void main(String[] args) {
		logger.info("============= MyBoot-Oauth Start begin =============");
		SpringApplication.run(OauthApplication.class, args);
		logger.info("============= MyBoot-Oauth Start end =============");
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
