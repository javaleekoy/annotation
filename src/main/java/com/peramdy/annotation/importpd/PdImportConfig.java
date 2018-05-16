package com.peramdy.annotation.importpd;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author peramdy on 2018/5/16.
 */
@Configuration
@Import(PdImportBean.class)
public class PdImportConfig {

    public PdImportConfig() {
        System.out.println("spring<PdImportConfig> 容器初始化！");
    }
}
