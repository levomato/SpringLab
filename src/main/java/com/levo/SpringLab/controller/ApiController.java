package com.levo.SpringLab.controller;

import com.levo.SpringLab.model.Task;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

@RestController
public class ApiController {

    ArrayList<Task> TaskList = new ArrayList<>();

    @GetMapping("/api/employees/{id}")
    @ResponseBody
    public String getEmployeesById(@PathVariable String id) {
        return "ID:" + id;
    }

    @GetMapping("/api/tasks/")
    public ArrayList<Task> getTasks() {
        return TaskList;
    }

    @GetMapping("/api/tasks/{id}")
    @ResponseBody
    public Task getTaskByID(@PathVariable int id) {
        for(Task task: TaskList) {
            if(task.getId() == id) {
                return task;
            }
        }
        return null;
    }

    @PostMapping("/api/task/add")
    public Task addTask(HttpServletRequest request) {

        String content = request.getParameter("content");
        String title = request.getParameter("title");
        Task task = new Task();
        task.setId(TaskList.size() + 1);
        task.setTitle(title);
        task.setContent(content);
        task.setDate(new Date());

        TaskList.add(task);
        return task;

    }

    @DeleteMapping("api/task/delete/{id}")
   public Task removeTask(@PathVariable int id) {

        for(Task task : TaskList) {
            if(task.getId() == id) {
                TaskList.remove(task);
                return task;
            }
        }
            return null;
    }

    @PutMapping("api/task/update/{id}")
    public Task updateTask(@PathVariable int id, HttpServletRequest request) {

        for(Task task : TaskList) {
            if(task.getId()==id) {
                if(request.getParameter("title") != null) {
                    String title = request.getParameter("title");
                    task.setTitle(title);
                }
                if(request.getParameter("content") != null) {
                    String content = request.getParameter("content");
                    task.setContent(content);
                }
                return task;
            }


        }
        return null;
    }


}
