package com.mattleith.cqrseventsrc.command;

import com.mattleith.cqrseventsrc.model.User;
import com.mattleith.cqrseventsrc.repository.UserWriteRepository;

public class UserCommandHandler {
    private UserWriteRepository writeRepository;
    public UserCommandHandler(UserWriteRepository repository) {
        this.writeRepository = repository;
    }

    public User handleCreateUserCommand(CreateUserCommand command) {
        User user = new User(command.getUserId(), command.getFirstName(), command.getLastName());
        writeRepository.addUser(user.getUserid(), user);
        return user;
    }

    public User handleUpdateUserCommand(UpdateUserCommand command) {
        User user = writeRepository.getUser(command.getUserId());
        user.setAddresses(command.getAddresses());
        user.setContacts(command.getContacts());
        writeRepository.addUser(user.getUserid(), user);
        return user;
    }
}
