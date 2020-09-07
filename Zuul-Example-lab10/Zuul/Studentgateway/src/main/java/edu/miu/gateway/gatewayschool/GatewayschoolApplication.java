package edu.miu.gateway.gatewayschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy

public class GatewayschoolApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayschoolApplication.class, args);
    }

}
