package com.peramdy.annotation.importpd;

/**
 * @author peramdy on 2018/5/16.
 */
public class PdImportBean {

    private Integer id;
    private String name;
    private String password;


    public void sayHello() {
        System.out.println("hello PdImportBean !");
    }

    /**
     * bean初始化方法
     */
    public void init() {
        System.out.println("PdImportBean 初始化。。。");
    }

    /**
     * bean销毁方法
     */
    public void destroy() {
        System.out.println("PdImportBean 销毁。。。");
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
