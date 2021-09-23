package com.study.jpa;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.filter.HiddenHttpMethodFilter;

//JPA Auditing 기능을 사용하기 위해 main 클래스에 @EnableJpaAuditing 애노테이션을 붙여준다.
@EnableJpaAuditing
@SpringBootApplication
public class StudyJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyJpaApplication.class, args);
	}

	@Bean
	public HiddenHttpMethodFilter hiddenHttpMethodFilter() {
		return new HiddenHttpMethodFilter();
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
