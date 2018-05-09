package com.apress.spring;

import com.apress.spring.domain.Journal;
import com.apress.spring.repository.JournalRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootJounalApplication {

    @Bean
    InitializingBean saveData(JournalRepository repo) {
        return () -> {
            repo.save(new Journal("스프링 부트 입문", "오늘부터 스프링 부트 공부하기 시작했다.", "01/01/2016"));
            repo.save(new Journal("간단한 스프링 부트 프로젝트", "스프링 부트 프로젝트를 처음 만들어보았다.", "01/02/2016"));
            repo.save(new Journal("스프링 부트 해부", "스프링 부트를 자세히 살펴보았다.", "02/01/2016"));
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJounalApplication.class, args);
    }
}
