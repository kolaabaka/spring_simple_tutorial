package com.fx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TaskManager {

    @Autowired(required = false)
    private Task task;

    public TaskManager(Task task) {
        this.task = task;
    }

    public void printTask(){
        if(task != null) {
            System.out.println("Current task " + task.toString());
        } else {
            System.out.println("No task");
        }
    }
}
