package com.peramdy.annotation.factorybean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author peramdy on 2018/5/16.
 */
@Configuration
public class PdFactoryBeanConfig {

    @Bean
    public PdFactoryBean pdFactoryBean() {
        return new PdFactoryBean();
    }

}
