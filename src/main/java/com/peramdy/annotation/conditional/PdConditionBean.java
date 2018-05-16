package com.peramdy.annotation.conditional;

/**
 * @author peramdy on 2018/5/15.
 */
public class PdConditionBean {

    private Integer id;
    private String name;
    private String password;

    public PdConditionBean() {
        System.out.println("spring<PdConditionBean> 容器初始化了");
    }

    public void sayHello() {
        System.out.println("hello PdConditionBean !");
    }


    /**
     * bean初始化方法
     */
    public void init() {
        System.out.println("PdConditionBean 初始化。。。");
    }

    /**
     * bean销毁方法
     */
    public void destroy() {
        System.out.println("PdConditionBean 销毁。。。");
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
