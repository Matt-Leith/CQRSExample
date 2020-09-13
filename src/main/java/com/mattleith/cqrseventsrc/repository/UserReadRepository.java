package com.mattleith.cqrseventsrc.repository;

import com.mattleith.cqrseventsrc.model.read.UserAddress;
import com.mattleith.cqrseventsrc.model.read.UserContact;

import java.util.HashMap;
import java.util.Map;

public class UserReadRepository {
    private Map<String, UserAddress> userAddress = new HashMap<>();
    private Map<String, UserContact> userContact = new HashMap<>();

    public UserAddress getUserAddress(String key) {
        return userAddress.get(key);
    }

    public void addUserAddress(String key, UserAddress value) {
        userAddress.put(key, value);
    }

    public UserContact getUserContact(String key) {
        return userContact.get(key);
    }

    public void addUserContact(String key, UserContact value) {
        userContact.put(key, value);
    }
}
