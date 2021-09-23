package com.study.jpa.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;

@Getter
// 테이블로 매핑하지 않고, 자식 Entity에게 매핑정보를 상속하기 위한 어노테이션
@MappedSuperclass
// JPA에게 해당 Entity Auditing기능을 사용한다는 것을 알리는 어노테이션
// Spring Data JPA에서 시간에 대해 자동으로 값을 넣어주는 기능
@EntityListeners(AuditingEntityListener.class)
public class TimeEntity {

	// Entity가 생성되어 저장될 때 시간이 자동 저장됨
	@CreatedDate
	@Column(updatable = false)
	private LocalDateTime createdDate;
	
	// 조회한 Entity 값을 변경할 때 시간이 자동 저장됨
	@LastModifiedDate
	private LocalDateTime modifiedDate;
}
