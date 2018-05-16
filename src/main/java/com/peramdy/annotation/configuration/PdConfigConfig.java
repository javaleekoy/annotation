package com.peramdy.annotation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author peramdy on 2018/5/15.
 *         (1)、@Bean注解在返回实例的方法上，如果未通过@Bean指定bean的名称，则默认与标注的方法名相同；
 *         (2)、@Bean注解默认作用域为单例singleton作用域，可通过@Scope(“prototype”)设置为原型作用域；
 *         (3)、既然@Bean的作用是注册bean对象，那么完全可以使用@Component、@Controller、@Service、@Ripository等注解注册bean，
 *         当然需要配置@ComponentScan注解进行自动扫描。
 */
@Configuration
public class PdConfigConfig {


    /**
     * 该配置等同于springContext.xml中的bean配置
     *
     * @return
     */
    @Bean(initMethod = "init", destroyMethod = "destroy")
    @Scope("prototype")
    public PdConfigBean pdBean() {
        return new PdConfigBean();
    }

}
