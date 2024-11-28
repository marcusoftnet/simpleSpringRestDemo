package com.aaro.userAPI.repository;

import com.aaro.userAPI.model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    List<User> findAll();
    Optional<User> findById(String id);
    void save(User user);
    void update(User user);
    void deleteById(String id);
}
