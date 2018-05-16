package com.peramdy.annotation.componentscan;

import org.springframework.stereotype.Component;

/**
 * @author peramdy on 2018/5/15.
 */
@Component
public class PdScanBean {

    private Integer id;
    private String name;
    private String password;

    public PdScanBean() {
        System.out.println("spring<PdScanBean> 容器初始化了");
    }

    public void sayHello() {
        System.out.println("hello PdScanBean !");
    }


    /**
     * bean初始化方法
     */
    public void init() {
        System.out.println("PdScanBean 初始化。。。");
    }

    /**
     * bean销毁方法
     */
    public void destroy() {
        System.out.println("PdScanBean 销毁。。。");
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


}
