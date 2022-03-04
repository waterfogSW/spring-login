package com.waterfogsw.springlogin.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Role {
    MEMBER("ROLE_MEMBER"),
    ADMIN("ROLE_ADMIN");

    private String value;
}
