package com.hexagonal.task.application.usecases;

import com.hexagonal.task.domain.ports.in.DeleteTaskUseCase;
import com.hexagonal.task.domain.ports.out.TaskRepositoryPort;

public class DeleteTaskUseCaseImp implements DeleteTaskUseCase {
    private final TaskRepositoryPort taskRepositoryPort;

    public DeleteTaskUseCaseImp(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Boolean deleteTask(Long id) {
        return taskRepositoryPort.deleteById(id);
    }
}
