package com.zxf.provider;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
@EnableDubbo
@SpringBootApplication
public class ProviderApp {
	public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(ProviderApp.class, args);
    }

}
