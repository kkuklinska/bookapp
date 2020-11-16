package org.example;


import org.example.repository.Classroom.InMemoryClassRoomRepository;
import org.example.repository.annotation.InMemoryRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedList;

@Configuration
public class RepositoryConfiguration {

    @Bean
    @InMemoryRepository
    public InMemoryClassRoomRepository repository(){
        return new InMemoryClassRoomRepository(new LinkedList<>());
    }
}
