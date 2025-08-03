package com.example.fk.service;

import com.example.fk.dto.TodoDto;
import com.example.fk.entity.Todo;
import com.example.fk.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    @Autowired
    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public void addTodo(TodoDto todoDto){
        Todo todo =new Todo(todoDto.getName(),todoDto.getDescription(), todoDto.isCompleted());
        todoRepository.save(todo);

    }

    public List<Todo> getAllTodo(){
        List<Todo> todoList= todoRepository.findAll();

        return todoList;

    }
}
