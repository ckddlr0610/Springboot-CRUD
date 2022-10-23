package com.test.crud.controller;

import com.test.crud.model.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserControllerTest {
    private final UserController userController = new UserController();

    @BeforeEach
    void setup() {
        userController.init();
    }

    @Test
    void getUser() {
        //when
        User user = userController.getUser("0");

        // then
        Assertions.assertThat(user.getNickname()).isEqualTo("a");
    }

    @Test
    void getUserList() {
        List<User> userList = userController.getUserList();

        Assertions.assertThat(userList.size()).isEqualTo(3);
    }

    @Test
    void postUser() {
        userController.postUser("0", "edited", 10);
        User user = userController.getUser("0");
        Assertions.assertThat(user.getNickname()).isEqualTo("edited");
    }
}