package com.fx;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.fx");

        TaskManager taskManagerConfig = context.getBean(TaskManager.class);
        taskManagerConfig.printTask();
        try{
            taskManagerConfig.justThrow();
        } catch (Exception e) {

        }

        context.close();// OMG context can be close
    }
}
