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

        TaskManager taskManagerConfig = context.getBean(TaskManager.class);
        taskManagerConfig.printTask();
    }
}
