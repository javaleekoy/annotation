package com.peramdy.annotation.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author peramdy on 2018/5/15.
 */
@Configuration
public class PdConditionConfig {

    @Conditional(value = {PdWindowsCondition.class})
    @Bean("pdConditionBean1")
    public PdConditionBean pdConditionBean() {
        return new PdConditionBean();
    }

    @Conditional(value = {PdLinuxCondition.class})
    @Bean(name = "pdConditionBean2")
    public PdConditionBean pdConditionBean2() {
        return new PdConditionBean();
    }

}
