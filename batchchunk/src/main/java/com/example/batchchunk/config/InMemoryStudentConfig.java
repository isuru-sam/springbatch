package com.example.batchchunk.config;

import com.example.batchchunk.dto.StudentDTO;

import org.springframework.batch.item.ItemReader;
import org.springframework.context.annotation.Bean;

public class InMemoryStudentConfig {

    @Bean
    ItemReader<StudentDTO> inMemoryStudentReader() {
        return new InMemoryStudentReader();
    }
}
