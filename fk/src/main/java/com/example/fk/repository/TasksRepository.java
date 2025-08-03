package com.example.fk.repository;

import com.example.fk.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TasksRepository extends JpaRepository<Task,Long> {
    List<Task> findByTodoId(Long todoId);
}
