package com.peramdy.annotation.importpd;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author peramdy on 2018/5/16.
 * 1.包扫描+注解
 * 2.@bean (导入第三方jar)
 * 3.@import
 *   #1.import
 *   #2.实现importselector
 *   #3.实现importbeandefinitionregistrar
 *
 *
 */
public class PdTest {

    public static void main(String[] args) {

        /*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PdImportConfig.class);
        String[] names = context.getBeanDefinitionNames();
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        PdImportBean pdImportBean = (PdImportBean) context.getBean("com.peramdy.annotation.importpd.PdImportBean");
        pdImportBean.sayHello();*/


        /*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PdImportConfig2.class);
        String[] names = context.getBeanDefinitionNames();
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        PdImportBean pdImportBean = (PdImportBean) context.getBean("com.peramdy.annotation.importpd.PdImportBean");
        pdImportBean.sayHello();*/


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PdImportConfig3.class);
        String[] names = context.getBeanDefinitionNames();
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        PdImportBean pdImportBean = (PdImportBean) context.getBean("com.peramdy.annotation.importpd.PdImportBean");
        pdImportBean.sayHello();
    }

}
