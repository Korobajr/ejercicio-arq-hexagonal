package com.hexagonal.task.application.usecases;

import com.hexagonal.task.domain.models.Task;

import com.hexagonal.task.domain.ports.in.UpdateTaskUseCase;
import com.hexagonal.task.domain.ports.out.TaskRepositoryPort;

import java.util.Optional;

public class UpdateTaskUseCaseImp implements UpdateTaskUseCase{
    private final TaskRepositoryPort taskRepositoryPort;

    public UpdateTaskUseCaseImp(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Optional<Task> updateTask(Long id, Task updateTask) {
        return taskRepositoryPort.taskUpdate(updateTask);
    }
}
