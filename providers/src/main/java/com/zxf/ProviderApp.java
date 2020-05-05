package com.zxf;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@EnableDubbo  // 扫描dubbo 的@Service
@SpringBootApplication
@ImportResource({"classpath:dubbo-provider.xml"})
public class ProviderApp {
	public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(ProviderApp.class, args);
    }
}
