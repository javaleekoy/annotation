package com.peramdy.annotation.importpd;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author peramdy on 2018/5/16.
 */
@Configuration
@Import(value = {PdImportSelector.class})
public class PdImportConfig2 {

    public PdImportConfig2() {
        System.out.println("spring<PdImportConfig2> 容器初始化！");
    }
}
