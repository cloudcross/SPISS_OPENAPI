package com.jht.spiss.openapi.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * APP启动窗口
 * @author cloud
 * @version 1
 */
@SpringBootApplication
@EnableDiscoveryClient
/*@EnableZuulProxy
@EnableHystrix*/
public class Application  {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
