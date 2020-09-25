package com.jambus.az.function.demo;

import com.microsoft.azure.serverless.functions.annotation.*;
import com.microsoft.azure.serverless.functions.ExecutionContext;

/**
 * Hello function with HTTP Trigger.
 */
public class Function {
    @FunctionName("sayhi")
    public String sayhi(@HttpTrigger(name = "req", methods = {"get", "post"}, authLevel = AuthorizationLevel.ANONYMOUS) String req,
                        ExecutionContext context) {
        return String.format("Hello, %s!", req);
    }
}
