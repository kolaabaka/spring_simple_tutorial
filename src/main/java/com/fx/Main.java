package com.fx;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.fx");
        Task task = context.getBean(Task.class);
        System.out.println(task);

        Task task2 = (Task)context.getBean("main-task");
        System.out.println(task2);

        System.out.println(task == task2); //same object

        TaskManager taskManager = context.getBean(TaskManager.class);
        taskManager.printTask();

        //Create bean with configuration
        AnnotationConfigApplicationContext contextConfig = new AnnotationConfigApplicationContext(TaskConfiguration.class);
        Task taskConfig = contextConfig.getBean(Task.class);
        System.out.println(taskConfig);

        TaskManager taskManagerConfig = contextConfig.getBean(TaskManager.class);
        taskManagerConfig.printTask();
    }
}
