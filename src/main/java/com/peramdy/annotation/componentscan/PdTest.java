package com.peramdy.annotation.componentscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author peramdy on 2018/5/15.
 */
public class PdTest {

    public static void main(String[] args) {
       /*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(PdScanConfig.class);
        context.register(PdScanBean.class);*/

        ApplicationContext context = new AnnotationConfigApplicationContext(PdScanConfig.class);
        String[] names = context.getBeanDefinitionNames();
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        /*PdScanBean pdScanBean = (PdScanBean) context.getBean("pdScanBean");
        pdScanBean.sayHello();*/

        /*ApplicationContext xmlContext = new ClassPathXmlApplicationContext("classpath:springContext.xml");
        String[] names = xmlContext.getBeanDefinitionNames();
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        PdScanBean pdScanBean = (PdScanBean) xmlContext.getBean("pdScanBean");
        pdScanBean.sayHello();*/
    }

}
