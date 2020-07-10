package ch.zli.m223.punchclock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class PunchclockApplication {


	public static void main(String[] args) {
		SpringApplication.run(PunchclockApplication.class, args);
	}
	//code from: https://auth0.com/blog/implementing-jwt-authentication-on-spring-boot/
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
