package com.xintong.maintain.cloudfeignconsumer;

import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class CloudFeignConsumerApplication {
    AbstractLoadBalancerRule rule;

    public static void main(String[] args) {
        SpringApplication.run(CloudFeignConsumerApplication.class, args);
    }

}
