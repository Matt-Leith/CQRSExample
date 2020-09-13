package com.mattleith.cqrseventsrc.model.read;

import com.mattleith.cqrseventsrc.model.Address;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UserAddress {
    private Map<String, Set<Address>> addressByRegion = new HashMap<>();

    public Map<String, Set<Address>> getAddressByRegion() {
        return addressByRegion;
    }

    public void setAddressByRegion(Map<String, Set<Address>> addressByRegion) {
        this.addressByRegion = addressByRegion;
    }
}
