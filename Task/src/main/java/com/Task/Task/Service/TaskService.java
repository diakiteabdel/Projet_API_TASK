package com.Task.Task.Service;

import com.Task.Task.Repository.TaskRepository;
import org.springframework.scheduling.config.Task;

public interface TaskService {

     Task create(Task task);
}
