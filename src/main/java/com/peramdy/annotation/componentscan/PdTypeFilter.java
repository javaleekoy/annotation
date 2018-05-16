package com.peramdy.annotation.componentscan;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @author peramdy on 2018/5/15.
 */
public class PdTypeFilter implements TypeFilter {

    /**
     * @param metadataReader        读取当前正在扫描类的相关信息
     * @param metadataReaderFactory 可以获取其他任何类的相关信息
     * @return
     * @throws IOException
     */
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        //获取当前注解信息
        AnnotatedTypeMetadata annotatedTypeMetadata = metadataReader.getAnnotationMetadata();
        //获取当前正在扫描类的类信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        //获取当前类的资源信息
        Resource resource = metadataReader.getResource();
        System.out.println("path: --> " +resource.getURL());
        System.out.println("className: --> " + classMetadata.getClassName());
        if (classMetadata.getClassName().contains("Controller")) {
            return true;
        }
        return false;
    }
}
