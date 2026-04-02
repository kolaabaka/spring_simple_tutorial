package com.fx;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ToString
@Scope("prototype") //default singleton
public class Task {

    private final Long duration;
    private final String name;

    @PostConstruct //need Jakarta annotation api
    public void postConstruct(){
        System.out.println("task post construct");
    }

    @PreDestroy
    public void preDestroy(){ // scope prototype then don`t call this method, because prototype bean not contain in context
        System.out.println("task pre destroy");
    }

    public Task(
        @Value("${task.name}") String name,
        @Value("${task.duration}") Long duration

    ){
        this.duration = duration;
        this.name = name;
    }
}
