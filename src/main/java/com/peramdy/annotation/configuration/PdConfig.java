package com.peramdy.annotation.configuration;

import org.springframework.context.annotation.Configuration;

/**
 * @author peramdy on 2018/5/15.
 */
@Configuration
public class PdConfig {

    public PdConfig() {
        System.out.println("spring<PdConfig>容器开始初始化了！");
    }
}
