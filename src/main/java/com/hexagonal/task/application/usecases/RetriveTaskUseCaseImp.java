package com.hexagonal.task.application.usecases;

import com.hexagonal.task.domain.models.Task;
import com.hexagonal.task.domain.ports.in.RetrieveTaskUseCase;
import com.hexagonal.task.domain.ports.out.TaskRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetriveTaskUseCaseImp implements RetrieveTaskUseCase {
    private final TaskRepositoryPort taskRepositoryPort;

    public RetriveTaskUseCaseImp(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Optional<Task> getTaskById(Long id) {
        return taskRepositoryPort.findById(id);
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepositoryPort.findAll();
    }
}
