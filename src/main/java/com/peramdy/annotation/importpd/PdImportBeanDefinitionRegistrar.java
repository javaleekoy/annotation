package com.peramdy.annotation.importpd;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author peramdy on 2018/5/16.
 */
public class PdImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        if (!registry.containsBeanDefinition("pdImportBean3")) {
            /*AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.rootBeanDefinition(PdImportConfig.class)
                    .getBeanDefinition();
            registry.registerBeanDefinition("pdImportBean3", beanDefinition);*/

            RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(PdImportConfig.class);
            registry.registerBeanDefinition("pdImportBean3", rootBeanDefinition);
        }
    }

}
