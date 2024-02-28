package com.hexagonal.task.domain.ports.in;

public interface DeleteTaskUseCase {
    Boolean deleteTask(Long id);
}
