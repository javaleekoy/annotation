package com.peramdy.annotation.factorybean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author peramdy on 2018/5/16.
 */
public class PdTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PdFactoryBeanConfig.class);
        String[] names = context.getBeanDefinitionNames();
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        Object obj1 = context.getBean("pdFactoryBean");
        Object obj2 = context.getBean("pdFactoryBean");
        System.out.println(obj1 == obj2);
        //获取注册类
        System.out.println(context.getBean("pdFactoryBean").getClass());
        //获取factorybean本身需要添加"&"
        System.out.println(context.getBean("&pdFactoryBean").getClass());
    }

}
