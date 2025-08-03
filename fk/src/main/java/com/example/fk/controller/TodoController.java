package com.example.fk.controller;

import com.example.fk.dto.TodoDto;
import com.example.fk.entity.Todo;
import com.example.fk.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TodoController {

    @Autowired
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }


    @GetMapping()
    public String getTodo(){

        return "TodoYeppy";
    }

    @GetMapping("/a")
    public List<Todo> getAllTodo(){
        List<Todo> todoList = todoService.getAllTodo();

        return  todoList;
    }

    @PostMapping("/a")
    public void addTodo(@RequestBody TodoDto todoDto){
        todoService.addTodo(todoDto);

        //return todo;

    }
}
