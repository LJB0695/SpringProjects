package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BeanConfig {

    @Bean
    public Address getAdd(){
        return new Address("New York", "New York", "USA", "11111");
    }
    @Bean
    public Phone getPh() {
        return new Phone("5555555555");
    }

    @Bean
    @Autowired
    public Student getInfo(List<Phone> ph, Address add) {
        return new Student(00, "phil", ph, add);
    }
}
