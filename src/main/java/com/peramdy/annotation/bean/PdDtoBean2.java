package com.peramdy.annotation.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author peramdy on 2018/5/15.
 */
public class PdDtoBean2 implements InitializingBean, DisposableBean {

    private Integer id;
    private String name;
    private String password;

    public PdDtoBean2() {
        System.out.println("spring<PdDtoBean2> 容器初始化了");
    }

    public void sayHello() {
        System.out.println("hello PdDtoBean !");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("PdDtoBean2 销毁。。。");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("PdDtoBean2 初始化。。。");
    }
}
