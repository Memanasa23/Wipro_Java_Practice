package com.example.notificationms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = "com.example.notificationms")
@EnableDiscoveryClient
public class NotificationmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationmsApplication.class, args);
	}

}
