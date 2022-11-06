package com.test.crud.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter @Setter @AllArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    private String username;
    private Integer age;
}
