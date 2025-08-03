package com.example.fk.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "todo")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private boolean isCompleted;

    @OneToMany(mappedBy = "todo",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Task> tasks;

    public Todo() {
    }

    public Todo( String name, String description,boolean isCompleted) {
        //this.id = id;
        this.name = name;
        this.description=description;
        this.isCompleted = isCompleted;
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
