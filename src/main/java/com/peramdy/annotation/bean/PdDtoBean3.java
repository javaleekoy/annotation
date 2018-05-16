package com.peramdy.annotation.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author peramdy on 2018/5/15.
 */
public class PdDtoBean3 {

    private Integer id;
    private String name;
    private String password;

    public PdDtoBean3() {
        System.out.println("spring<PdDtoBean3> 容器初始化了");
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

    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("PdDtoBean3 销毁。。。");
    }

    @PostConstruct
    public void init() throws Exception {
        System.out.println("PdDtoBean3 初始化。。。");
    }
}
