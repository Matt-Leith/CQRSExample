package com.mattleith.cqrseventsrc.repository;

import com.mattleith.cqrseventsrc.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepository {
    private Map<String, User> store = new HashMap<>();

    public void addUser(String userId, User user) {
        store.put(userId, user);
    }

    public User getUser(String userId) {
        return store.get(userId);
    }
}
