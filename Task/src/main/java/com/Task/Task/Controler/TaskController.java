package com.Task.Task.Controler;

import com.Task.Task.Service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("api/")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @PostMapping("task")
    public Task nouveau(Task task){
        return taskService.create(task);
    }
}
