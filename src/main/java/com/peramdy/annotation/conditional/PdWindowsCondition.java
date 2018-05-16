package com.peramdy.annotation.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author peramdy on 2018/5/15.
 */
public class PdWindowsCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        Environment environment = context.getEnvironment();
        System.out.println("PdWindowsCondition --> "+ environment.getProperty("os.name"));
        String os = environment.getProperty("os.name");
        if (os.contains("Windows")) {
            return true;
        }
        return false;
    }
}
