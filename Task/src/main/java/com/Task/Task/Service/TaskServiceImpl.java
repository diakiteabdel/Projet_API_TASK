package com.Task.Task.Service;

import com.Task.Task.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService{
    @Autowired
    private TaskRepository taskRepository;


    @Override
    public Task create(Task task) {
        return taskRepository.save(task);
    }
}
