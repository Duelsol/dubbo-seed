package me.duelsol.dubboseed.consumer;

import me.duelsol.dubboseed.common.service.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@EnableDubbo
@SpringBootApplication
public class ConsumerServiceApplication {

    @DubboReference(version = "${demo.service.version}")
    private DemoService demoService;

    @PostConstruct
    public void init() {
        System.out.println(demoService.sayHello("hello"));
    }

    public static void main(String[] args) {
        SpringApplication.run(ConsumerServiceApplication.class, args).close();
    }

}
