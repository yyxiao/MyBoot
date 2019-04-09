package com.xyy;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OauthApplication {
	private static Logger logger = Logger.getLogger(OauthApplication.class);

	public static void main(String[] args) {
		logger.info("============= MyBoot-Oauth Start begin =============");
		SpringApplication.run(OauthApplication.class, args);
		logger.info("============= MyBoot-Oauth Start end =============");
	}
}
