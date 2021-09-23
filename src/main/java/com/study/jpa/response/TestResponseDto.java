package com.study.jpa.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TestResponseDto {

	private Long id;

	@Builder
	public TestResponseDto(Long id) {
		this.id = id;
	}

}