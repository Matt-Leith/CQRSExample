package com.mattleith.cqrseventsrc.query;

import com.mattleith.cqrseventsrc.model.Address;
import com.mattleith.cqrseventsrc.model.Contact;
import com.mattleith.cqrseventsrc.model.read.UserAddress;
import com.mattleith.cqrseventsrc.model.read.UserContact;
import com.mattleith.cqrseventsrc.repository.UserReadRepository;

import java.util.Set;

public class DefaultQueryHandler {
    private UserReadRepository readRepository;

    public DefaultQueryHandler(UserReadRepository readRepository) {
        this.readRepository = readRepository;
    }

    public Set<Contact> handle(ContactByTypeQuery query) {
        UserContact userContact = readRepository.getUserContact(query.getUserId());
        return userContact.getContactByType().get(query.getContactType());
    }

    public Set<Address> handle(AddressByRegionQuery query) {
        UserAddress userAddress = readRepository.getUserAddress(query.getUserId());
        return userAddress.getAddressByRegion().get(query.getState());
    }
}
