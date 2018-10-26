package com.feifei.animal;

import com.feifei.animal.entity.User;
import com.feifei.animal.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AnimalApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
        System.out.println("--select All test");
        User user = new User();
        user.setNum(0);
        user.setType("admin");
        User user2 = new User();
        user2.setNum(0);
        user2.setType("person");
        User user3 = new User();
        user3.setNum(0);
        user3.setType("enterprise");
        userMapper.insert(user);
        userMapper.insert(user2);
        userMapper.insert(user3);
    }

}
