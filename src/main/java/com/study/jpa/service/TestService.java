package com.study.jpa.service;

import javax.transaction.Transactional;

import com.study.jpa.request.TestRequestDto;

public interface TestService {

	@Transactional
	public Long write(TestRequestDto testRequestDto);
}
