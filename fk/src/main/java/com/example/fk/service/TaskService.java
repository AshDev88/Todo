package com.example.fk.service;

import com.example.fk.entity.Task;
import com.example.fk.entity.Todo;
import com.example.fk.repository.TasksRepository;
import com.example.fk.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class TaskService {
    TasksRepository tasksRepository;
    TodoRepository todoRepository;

    public TaskService(TasksRepository tasksRepository,TodoRepository todoRepository) {
        this.tasksRepository = tasksRepository;
        this.todoRepository=todoRepository;
    }

    public List<Task> getAllTasks(Long todoId){


        return tasksRepository.findByTodoId(todoId);


    }

    public Task save(long todoID,Task task){
        Todo todo=todoRepository.getReferenceById(todoID);
        task.setTodo(todo);

        Task taskSaved= tasksRepository.save(task);

        return taskSaved;
    }

}
