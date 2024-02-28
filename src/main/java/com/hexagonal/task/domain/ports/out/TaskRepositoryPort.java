package com.hexagonal.task.domain.ports.out;

import com.hexagonal.task.domain.models.Task;

import java.util.List;
import java.util.Optional;

public interface TaskRepositoryPort {
    Task save(Task task);
    Optional<Task> findById(Long id);
    List<Task> findAll();
    Optional<Task> taskUpdate(Task task);
    boolean deleteById(Long id);
}
