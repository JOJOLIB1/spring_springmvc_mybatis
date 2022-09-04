package com.jjj.spring5.newfecture;

import jakarta.annotation.Nullable;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @className: com.jjj.spring5.newfecture.Generic
 * @description:
 * @author: 江骏杰
 * @create: 2022-09-04 10:21
 */
public class Generic {
    @Nullable
    public void spring() {
        GenericApplicationContext context = new GenericApplicationContext();
        context.refresh();
        context.registerBean("generic",Generic.class, Generic::new);
        context.getBean("generic");
    }
}
