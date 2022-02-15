package me.duelsol.dubboseed.provider.service;

import me.duelsol.dubboseed.common.service.DemoService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author 冯奕骅
 */
@DubboService(version = "${demo.service.version}")
public class DemoServiceImpl implements DemoService {

    @Value("${demo.service.name}")
    private String serviceName;

    public String sayHello(String name) {
        return String.format("[%s] : Hello , %s", serviceName, name);
    }

}
