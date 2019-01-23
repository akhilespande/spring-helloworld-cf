package com.akhilesh;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@SpringBootApplication
public class SpringHelloworldCfApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHelloworldCfApplication.class, args);
	}
}
@Slf4j
@RestController
class MessageRestController {

	@RequestMapping("/hello")
	String getMessage(@RequestParam(value = "name") String name) {
		String rsp = "Hi " + name + " : responded on - " + new Date();
		log.info(rsp);
		return rsp;
	}
}