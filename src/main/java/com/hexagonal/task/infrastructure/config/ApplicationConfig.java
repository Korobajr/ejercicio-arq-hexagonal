package com.hexagonal.task.infrastructure.config;

import com.hexagonal.task.application.services.TaskService;
import com.hexagonal.task.application.usecases.*;
import com.hexagonal.task.domain.ports.in.GetAdditionlTaskInfoUseCase;
import com.hexagonal.task.domain.ports.out.ExternalServicePort;
import com.hexagonal.task.domain.ports.out.TaskRepositoryPort;
import com.hexagonal.task.infrastructure.adapters.ExternalServiceAdapter;
import com.hexagonal.task.infrastructure.repositories.JpaTaskRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    public TaskService taskService(TaskRepositoryPort taskRepositoryPort, GetAdditionlTaskInfoUseCase getAdditionlTaskInfoUseCase) {
        return new TaskService(new CreateTaskUseCaseImp(taskRepositoryPort),
                new DeleteTaskUseCaseImp(taskRepositoryPort),
                new RetriveTaskUseCaseImp(taskRepositoryPort),
                new UpdateTaskUseCaseImp(taskRepositoryPort),
                getAdditionlTaskInfoUseCase);
    }

    @Bean
    public TaskRepositoryPort taskRepositoryPort(JpaTaskRepositoryAdapter jpaTaskRepositoryAdapter) {
        return jpaTaskRepositoryAdapter;
    }

    @Bean
    public GetAdditionlTaskInfoUseCase getAdditionlTaskInfoUseCase(ExternalServicePort externalServicePort) {
        return new GetAdditionalTaskInfoUseCaseImp(externalServicePort);
    }

    @Bean
    public ExternalServicePort externalServicePort() {
        return  new ExternalServiceAdapter();
    }
}
