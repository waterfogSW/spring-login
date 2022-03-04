package com.waterfogsw.springlogin.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString
public class Member {
    @Id
    @GeneratedValue
    private Long id;

    private String memberId;
    private String password;
    private Integer age;

    public Member(Long id, String memberId, String password, Integer age) {
        this.id = id;
        this.memberId = memberId;
        this.password = password;
        this.age = age;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
