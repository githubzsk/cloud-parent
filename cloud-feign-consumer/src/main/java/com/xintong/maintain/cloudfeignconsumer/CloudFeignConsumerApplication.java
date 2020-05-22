package com.xintong.maintain.cloudfeignconsumer;

import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient//开启Eureka客户端注册
@EnableFeignClients//开启Feign客户端
@EnableHystrix//开启Hystrix
public class CloudFeignConsumerApplication {
    AbstractLoadBalancerRule rule;

    public static void main(String[] args) {
        SpringApplication.run(CloudFeignConsumerApplication.class, args);
    }

}
