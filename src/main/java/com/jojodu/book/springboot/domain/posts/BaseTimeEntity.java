package com.jojodu.book.springboot.domain.posts;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass//이 클래스를 상속할 경우 필드들도 칼럼으로 인식
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseTimeEntity {
    @CreatedDate//Entity가 생성되어 저장될 때 시간이 자동 저장된다.
    private LocalDateTime createdData;

    @LastModifiedDate//조회한 Entity의 값을 변경할 때 시간이 자동 저장
    private LocalDateTime modifiedDate;


}
