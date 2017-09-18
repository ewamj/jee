package com.isa.javaeebasics.randomgenerator.interceptors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class ParametersLoggingInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(ParametersLoggingInterceptor.class);

    @AroundInvoke
    public Object logParameters(InvocationContext context) throws Exception {
        Object[] parameters = context.getParameters();
        String methodName = context.getMethod().getName();

        String parametersString = "";
        for (Object parameter : parameters) {
            parametersString += parameter.toString();
            parametersString += " ";
        }

        logger.info("Method " + methodName + " invoked with parameters: " + parametersString);

        return context.proceed();
    }
}
