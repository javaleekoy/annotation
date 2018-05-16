package com.peramdy.annotation.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

/**
 * @author peramdy on 2018/5/15.
 */
public class PdTest {

    public static void main(String[] args) {
        System.setProperty("os.name", "linux");
        /*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PdConditionConfig.class);*/
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PdConditionConfig2.class);
        Map<String, PdConditionBean> map = context.getBeansOfType(PdConditionBean.class);
        for (String key : map.keySet()) {
            System.out.println(key);
            System.out.println(map.get(key));
        }
    }

}