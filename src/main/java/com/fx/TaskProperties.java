package com.fx;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class TaskProperties {

    @Value("${task.name}")
    private String taskName;

    @Value("${task.duration}")
    private String taskDuration;

    @Value("#{'${list.values}'.split(',')}")
    private List<String> values;

    @Value("#{${map.values}}")
    private Map<String, Integer> mapValues;

    @Override
    public String toString() {
        return "TaskProperties{" +
            "taskName='" + taskName + '\'' +
            ", taskDuration='" + taskDuration + '\'' +
            ", values=" + values +
            ", mapValues=" + mapValues +
            '}';
    }
}
