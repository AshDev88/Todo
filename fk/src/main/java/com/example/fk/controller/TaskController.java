package com.example.fk.controller;

import com.example.fk.entity.Task;
import com.example.fk.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;



@RestController
@RequestMapping("/ta")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/task/{todoId}")
    public List<Task> getAllTasks(@PathVariable long todoId){
        return taskService.getAllTasks(todoId);

        //return tasksLists;
    }

    @PostMapping("/task/{todoId}")
    public void addTask(@PathVariable long todoId, @RequestBody Task task){


         taskService.save(todoId,task);


    }


}
