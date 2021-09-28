package com.study.jpa.response;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TestResponseDto {

	private Long id;
	private String writer;
	private String title;
	private String content;
	private LocalDateTime createdDate;
	private LocalDateTime modifiedDte;

	@Builder
	public TestResponseDto(
						   Long id, 
						   String writer, 
						   String title, 
						   String content, 
						   LocalDateTime createdDate,
						   LocalDateTime modifiedDte
						   ) 
	{
		this.id = id;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.createdDate = createdDate;
		this.modifiedDte = modifiedDte;

	}

	@Override
	public String toString() {
		return writer + "님 안녕하세요";
	}
	
}