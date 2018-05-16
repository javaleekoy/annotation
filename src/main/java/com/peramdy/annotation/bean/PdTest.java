package com.peramdy.annotation.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author peramdy on 2018/5/15.
 */
public class PdTest {

    public static void main(String[] args) {
        /*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PdBeanConfig.class);
        String[] names = context.getBeanDefinitionNames();
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        PdDtoBean pdDtoBean = (PdDtoBean) context.getBean("pdDtoBean2");
        PdDtoBean pdDtoBean2 = (PdDtoBean) context.getBean("pdDtoBean2");
        System.out.println(pdDtoBean == pdDtoBean2);
        //容器关闭会调用销毁方法
        context.close();*/

        /*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PdBeanConfig.class);
        String[] names = context.getBeanDefinitionNames();
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        PdDtoBean2 pdDtoBean = (PdDtoBean2) context.getBean("pdDtoBean2");
        PdDtoBean2 pdDtoBean2 = (PdDtoBean2) context.getBean("pdDtoBean2");
        System.out.println(pdDtoBean == pdDtoBean2);
        //容器关闭会调用销毁方法
        context.close();*/


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PdBeanConfig.class);
        String[] names = context.getBeanDefinitionNames();
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        PdDtoBean3 pdDtoBean = (PdDtoBean3) context.getBean("pdDtoBean3");
        PdDtoBean3 pdDtoBean2 = (PdDtoBean3) context.getBean("pdDtoBean3");
        System.out.println(pdDtoBean == pdDtoBean2);
        //容器关闭会调用销毁方法
        context.close();
    }

}
