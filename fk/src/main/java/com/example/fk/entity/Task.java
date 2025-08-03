package com.example.fk.entity;

import jakarta.persistence.*;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private boolean isCompleted;

    @ManyToOne
    @JoinColumn(name = "todo_id")
    private Todo todo;

    public Task() {
    }

    public Task(Long id, String name, String description, boolean isCompleted, Todo todo) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.isCompleted = isCompleted;
        this.todo = todo;
    }

    public Todo getTodo() {
        return todo;
    }

    public void setTodo(Todo todo) {
        this.todo = todo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
