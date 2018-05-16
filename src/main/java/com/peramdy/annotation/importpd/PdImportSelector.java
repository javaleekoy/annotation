package com.peramdy.annotation.importpd;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author peramdy on 2018/5/16.
 */
public class PdImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.peramdy.annotation.importpd.PdImportBean"};
    }
}
