package com.study.jpa.service.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.study.jpa.repository.TestRepository;
import com.study.jpa.request.TestRequestDto;
import com.study.jpa.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	private TestRepository testRepository;

	public TestServiceImpl(TestRepository testRepository) {
		this.testRepository = testRepository;

	}

	@Transactional
	@Override
	public Long write(TestRequestDto testRequestDto) {
		return testRepository.save(testRequestDto.toEntity()).getId();
	}
}
