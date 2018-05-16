package com.peramdy.annotation.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author peramdy on 2018/5/15.
 */
public class PdTest {


    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext(PdConfig.class);

        /**
         * getBean("pdBean") 会查找@Bean注解器名字为：pdBean ,@Bean若未指明bean的name那么会去方法的名称
         */
        ApplicationContext annotationBeanContext = new AnnotationConfigApplicationContext(PdConfigConfig.class);
        PdConfigBean pdConfigBean = (PdConfigBean) annotationBeanContext.getBean("pdConfigBean");
        pdConfigBean.sayHello();
        System.out.println(pdConfigBean);

        ApplicationContext annotationBeanContext2 = new AnnotationConfigApplicationContext(PdConfigConfig.class);
        PdConfigBean pdConfigBean2 = (PdConfigBean) annotationBeanContext2.getBean("pdConfigBean");
        pdConfigBean2.sayHello();
        System.out.println(pdConfigBean2);

        System.out.println(pdConfigBean == pdConfigBean2);

        /**
         * #@Bean若未指明bean的id那么会去类的名称
         *
         */
        /*ApplicationContext xmlContext = new ClassPathXmlApplicationContext("classpath:springContext.xml");
        PdBean pdBean = (PdBean) xmlContext.getBean("pdBean");
        pdBean.sayHello();*/


    }
}
