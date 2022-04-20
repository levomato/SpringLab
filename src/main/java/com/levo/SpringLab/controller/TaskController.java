package com.levo.SpringLab.controller;

import com.levo.SpringLab.model.Task;
import com.levo.SpringLab.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @Autowired
    TaskRepository taskRepository;

    @GetMapping("/firstTask")
    public Task firstTask() {
        return taskRepository.findByTitle("First Task");
    }
}
