package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;

import java.util.function.Function;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public Function<Message<HealthFirstMemberRequest>, HealthFirstMemberResponse> members() {
		return member -> {
			HealthFirstMemberResponse response = new HealthFirstMemberResponse();
			response.setMemberId(member.getPayload().getMemberId());
			response.setCoverage(HealthFirstMemberResponse.Coverage.MEDICAL);
			return response;
		};
	}

	@Bean
	public Function<Message<HealthFirstMemberRequest>, HealthFirstMemberResponse> members2() {
		return member -> {
			HealthFirstMemberResponse response = new HealthFirstMemberResponse();
			response.setMemberId(member.getPayload().getMemberId());
			response.setCoverage(HealthFirstMemberResponse.Coverage.DENTAL);
			return response;
		};
	}
}
