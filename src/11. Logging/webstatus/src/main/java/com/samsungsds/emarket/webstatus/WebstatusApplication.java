package com.samsungsds.emarket.webstatus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class WebstatusApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebstatusApplication.class, args);
	}

}
