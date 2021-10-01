package com.study.jpa.request;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.study.jpa.domain.Test;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TestRequestDto {

	private Long id;
	private String writer;
	private String title;
	private String content;
	private LocalDateTime createdDate;
	private LocalDateTime modifiedDte;

	// toEntity()는 dto에서 필요한 부분을 빌더패턴을 통해 entity로 만드는 역할
	public Test toEntity() {
		Test test = Test.builder()
						.id(id)
						.writer(writer)
						.title(title)
						.content(content)
						.build();
		return test;
	}

	// Setter대신 사용할 builder패턴
	@JsonCreator
	@Builder
	public TestRequestDto(
						  @JsonProperty("id") Long id, 
						  @JsonProperty("title") String title,
						  @JsonProperty("content") String content,
						  @JsonProperty("writer") String writer,
						  @JsonProperty("createdDate") LocalDateTime createdDate, 
						  @JsonProperty("modifiedDte") LocalDateTime modifiedDte
						  ) 
	{
		this.id = id;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.createdDate = createdDate;
		this.modifiedDte = modifiedDte;
	}
}
