package com.lay.spring.docker.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 18:56 2019/1/9
 * @Modified By:IntelliJ IDEA
 */
@Component
public class DemoEventListener2 implements ApplicationListener<DemoEvent> {
    private static final Logger log = LoggerFactory.getLogger(DemoEventListener2.class);

    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        throw new RuntimeException("ssss");
        //log.info("receiveB event:{}",demoEvent.getMessage());
    }
}
