package ru.kata.spring.boot_security.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.entity.User;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository <User, Long>{
    User getUserByName(String userName);

    User getUserById(long userId);

    void deleteUserById(long userId);

}