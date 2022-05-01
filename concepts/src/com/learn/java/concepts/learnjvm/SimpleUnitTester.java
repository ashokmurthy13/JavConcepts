package com.learn.java.concepts.learnjvm;

import java.lang.reflect.Method;

public class SimpleUnitTester {

    public static int execute(Class clazz) throws Exception {
        int failedCount = 0;
        Reflection obj = (Reflection) clazz.newInstance();
        Method[] methods = obj.getClass().getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().startsWith("test") && method.getReturnType().getName().equals("boolean")) {
                Object result = method.invoke(new Reflection());
                boolean ret = (Boolean) result;
                if (!ret)
                    failedCount++;
            }
        }
        return failedCount;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(execute(Reflection.class));
    }
}
