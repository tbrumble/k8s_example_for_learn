package ru.tbrumble.userverifier.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.tbrumble.userverifier.model.entity.UserEntity;


@Repository
public interface UserRepo extends JpaRepository<UserEntity, Long> {
    UserEntity getByUserLogin(String userLogin);
}
