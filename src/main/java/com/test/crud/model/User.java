package com.test.crud.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class User {
    private String id;
    private String nickname;
    private Integer age;
}
