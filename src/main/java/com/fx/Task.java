package com.fx;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component("main-task")
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Task {

    private final Long duration;
    private final String name;

    public Task(){
        this.duration = 30L;
        this.name = "Nama";
    }
}
