package com.peramdy.annotation.factorybean;

import com.peramdy.annotation.bean.PdDtoBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.lang.Nullable;

/**
 * @author peramdy on 2018/5/16.
 */
public class PdFactoryBean implements FactoryBean<PdDemoBean> {

    /**
     * 注册到容器中
     *
     * @return
     * @throws Exception
     */
    @Nullable
    @Override
    public PdDemoBean getObject() throws Exception {
        return new PdDemoBean();
    }

    /**
     * 类型
     *
     * @return
     */
    @Nullable
    @Override
    public Class<?> getObjectType() {
        return PdDtoBean.class;
    }

    /**
     * 是否为单例
     *
     * @return
     */
    @Override
    public boolean isSingleton() {
        return true;
    }
}
