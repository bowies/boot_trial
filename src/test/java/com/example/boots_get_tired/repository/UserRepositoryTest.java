package com.example.boots_get_tired.repository;

import com.example.boots_get_tired.BootsGetTiredApplicationTests;
import com.example.boots_get_tired.test.model.entity.User;
import com.example.boots_get_tired.test.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDateTime;

public class UserRepositoryTest extends BootsGetTiredApplicationTests {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void create(){

        User user = new User();
        user.setName("king");
        user.setEmail("king@king.king");
        user.setPhoneNumber("010-0000-0000");
        user.setRegDt(LocalDateTime.now());
        user.setRegUser("kinggodgeneral");

        User newUser = userRepository.save(user);
        System.out.println(newUser);
    }
}
