package com.peramdy.annotation.importpd;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author peramdy on 2018/5/16.
 */
@Configuration
@Import(value = {PdImportBeanDefinitionRegistrar.class})
public class PdImportConfig3 {

    public PdImportConfig3() {
        System.out.println("spring<PdImportConfig3> 容器初始化！");
    }
}
