package com.fx;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TaskConfiguration {

    @Bean("main-task")
    public Task task(){
        return new Task();
    }

    @Bean
    public TaskManager taskManager(Task task){ //spring make task and after that create taskManager
        return new TaskManager(task);
    }
}
