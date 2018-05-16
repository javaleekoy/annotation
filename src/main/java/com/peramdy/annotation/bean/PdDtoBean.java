package com.peramdy.annotation.bean;

/**
 * @author peramdy on 2018/5/15.
 */
public class PdDtoBean {

    private Integer id;
    private String name;
    private String password;

    public PdDtoBean() {
        System.out.println("spring<PdDtoBean> 容器初始化了");
    }

    public void sayHello() {
        System.out.println("hello PdDtoBean !");
    }


    /**
     * bean初始化方法
     */
    public void init() {
        System.out.println("PdDtoBean 初始化。。。");
    }

    /**
     * bean销毁方法
     */
    public void destroy() {
        System.out.println("PdDtoBean 销毁。。。");
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
