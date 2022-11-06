package com.test.crud.repository;

import com.test.crud.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository {
    void save(User user);
}
