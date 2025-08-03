package com.example.fk.repository;

import com.example.fk.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TasksRepository extends JpaRepository<Task,Long> {
}
