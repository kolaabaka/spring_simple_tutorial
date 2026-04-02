package com.fx;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.fx");

        Task task1 = context.getBean(Task.class);
        Task task2 = context.getBean(Task.class);

        System.out.println(task1 == task2);

        var taskProp = context.getBean(TaskProperties.class);

        System.out.println(taskProp);

        TaskManager taskManagerConfig = context.getBean(TaskManager.class);
        taskManagerConfig.printTask();

        context.close();// OMG context can be close
    }
}
