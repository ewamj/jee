package com.isa.javaeebasics.randomgenerator.interceptors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class TimeLoggingInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(TimeLoggingInterceptor.class);

    @AroundInvoke
    public Object measureAndLogTime(InvocationContext context) throws Exception {
        long startTime = System.nanoTime();
        Object proceed = context.proceed();
        long time = System.nanoTime() - startTime;
        logger.info("Method invocation took " + time + "ns");

        return proceed;
    }
}
