package com.peramdy.annotation.componentscan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @author peramdy on 2018/5/15.
 *         #@ComponentScan
 *         1.value指定扫描包路径
 *         2.excludeFilters 指定排除的扫描
 *         3.includeFilters 指定扫描且 useDefaultFilter=false 才生效,表示取消默认的扫描规则
 *         4.Filter 指定过滤条件
 *         5.type 指定过滤类型
 *         6.classes 指定过滤类 如：Controller.class,Service.class,前提是type是annotation,表示有@Controller,@Service注解的bean
 *         type:
 *         1.ANNOTATION 注解方式 (常用)
 *         2.ASSIGNABLE_TYPE 分配方式
 *         3.ASPECTJ  aspectj 表达式
 *         4.REGEX    正则表达式
 *         5.CUSTOM   自定义 (常用)
 */
@Configuration
/*@ComponentScan(value = "com.peramdy.annotation.componentscan")*/

/*@ComponentScan(basePackageClasses = {PdBean.class})*/

/*@ComponentScan(value = "com.peramdy.annotation.componentscan", excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class, Service.class})
})*/

/*@ComponentScan(value = "com.peramdy.annotation.componentscan", includeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})
}, useDefaultFilters = false)*/

@ComponentScan(value = "com.peramdy.annotation.componentscan", includeFilters = {
        @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {PdTypeFilter.class})
}, useDefaultFilters = false)

/*@ComponentScan(value = "com.peramdy.annotation.componentscan", includeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Service.class}),
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {PdScanC.class})
},useDefaultFilters = false)*/
public class PdScanConfig {

}
