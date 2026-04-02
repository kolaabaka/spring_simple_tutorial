package com.fx;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Getter
@Setter
@ToString
@Scope("prototype") //default singleton
public class Task {

    private final Long duration;
    private final String name;

    public Task(){
        this.duration = 30L;
        this.name = "Nama";
    }
}
