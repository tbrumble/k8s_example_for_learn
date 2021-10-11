package ru.tbrumble.userverifier.services;

import ru.tbrumble.userverifier.model.User;
import ru.tbrumble.userverifier.model.entity.UserEntity;

import java.util.List;

public interface UserService {
    Boolean blockUserByLogin(String login);
    Boolean unblockUserByLogin(String login);
    Boolean compareUserPassword(String login, String hashPassword);
    List<User> getAllUsers();
}
