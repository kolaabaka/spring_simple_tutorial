package com.fx;

import com.fx.aop.Loggable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TaskManager {

    @Autowired(required = false)
    private Task task;

    public TaskManager(Task task) {
        this.task = task;
    }

    @Loggable(value = "ERROR", times = 3)
    public Long printTask(){
        if(task != null) {
            System.out.println("Current task " + task.toString());
        } else {
            System.out.println("No task");
        }

        return task.getDuration();
    }

    @Loggable
    public void justThrow(){
        throw new RuntimeException("They call me, but why...");
    }
}
