package com.test.crud.controller;

import com.test.crud.model.User;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    private Map<String, User> userMap;

    @PostConstruct
    public void init() {
        userMap = new HashMap<>();
        userMap.put("0", new User("0", "a", 1));
        userMap.put("1", new User("1", "b", 2));
        userMap.put("2", new User("2", "c", 3));
    }

    @GetMapping("user/{id}")
    public User getUser(@PathVariable("id") String id) {
        return userMap.get(id);
    }

    @GetMapping("user/all")
    public List<User> getUserList() {
        return new ArrayList<>(userMap.values());
    }

    @PostMapping("user/{id}")
    public void postUser(
            @PathVariable("id") String id,
            @RequestParam("nickname") String nickname,
            @RequestParam("age") Integer age
    ) {
        User user = userMap.get(id);
        user.setNickname(nickname);
        user.setAge(age);
    }

    @DeleteMapping("user/{id}")
    public void deleteUser(@PathVariable("id") String id) {
        userMap.remove(id);
    }
}
