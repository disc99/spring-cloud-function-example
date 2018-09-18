package com.example.demo;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

public class AwsLambdaHandler extends SpringBootRequestHandler<HealthFirstMemberRequest, HealthFirstMemberResponse> {}