package com.fx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class TaskConfiguration {

    @Primary //if several same class beans primary annotation point primary for use bean
    @Bean("main-task")
    public Task task(){
        return new Task();
    }

    @Bean("not-main-task")
    public Task task2(){
        return new Task();
    }

    @Bean
    public TaskManager taskManager(@Autowired(required = true) Task task){ //spring make task and after that create taskManager
        return new TaskManager(task);
    }
}
