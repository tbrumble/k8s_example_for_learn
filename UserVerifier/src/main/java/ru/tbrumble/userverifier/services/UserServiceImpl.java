package ru.tbrumble.userverifier.services;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ru.tbrumble.userverifier.dto.UserDto;
import ru.tbrumble.userverifier.model.User;
import ru.tbrumble.userverifier.model.entity.UserEntity;
import ru.tbrumble.userverifier.model.web.WebUser;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private final UserDto userDto;

    public UserServiceImpl(UserDto userDto) {
        this.userDto = userDto;
    }

    @Override
    public Boolean blockUserByLogin(String login) {
        return userDto.blockUserByLogin(login);
    }

    @Override
    public Boolean unblockUserByLogin(String login) {
        return userDto.unblockUserByLogin(login);
    }

    @Override
    public Boolean compareUserPassword(String login, String hashPassword) {
        return userDto.compareUserPassword(login, hashPassword);
    }

    @Override
    public List<User> getAllUsers() {
        ModelMapper modelMapper = new ModelMapper();
        return Arrays.asList(modelMapper.map(userDto.getAllUsers(), User[].class));
    }
}
