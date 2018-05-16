package com.peramdy.annotation.conditional;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author peramdy on 2018/5/15.
 */
public class PdLinuxCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        Environment environment = context.getEnvironment();
        System.out.println("PdLinuxCondition --> " + environment.getProperty("os.name"));
        BeanDefinitionRegistry registry = context.getRegistry();
        //判断是否注册pdConditionBean
        if (!registry.containsBeanDefinition("pdConditionBean")) {
            System.out.println("none pdConditionBean");
            //注册pdConditionBean
            BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(PdConditionBean.class);
            AbstractBeanDefinition beanDefinition = builder.getBeanDefinition();
            registry.registerBeanDefinition("pdConditionBean", beanDefinition);
        }
        String os = environment.getProperty("os.name");
        if (os.contains("linux")) {
            return true;
        }
        return false;
    }
}
