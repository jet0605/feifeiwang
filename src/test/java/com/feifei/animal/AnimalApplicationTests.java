package com.feifei.animal;

import com.feifei.animal.entity.person.Person;
import com.feifei.animal.service.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@MapperScan("com.feifei.animal.dao")
@SpringBootTest
public class AnimalApplicationTests {

//    @Autowired
//    private UserMapper userMapper;
//
//    @Test
//    public void contextLoads() {
//        System.out.println("--select All test");
//        User user = new User();
//        user.setNum(0);
//        user.setType("admin");
//        User user2 = new User();
//        user2.setNum(0);
//        user2.setType("person");
//        User user3 = new User();
//        user3.setNum(0);
//        user3.setType("enterprise");
//        userMapper.insert(user);
//        userMapper.insert(user2);
//        userMapper.insert(user3);
//    }
    @Autowired
    PersonService personService;
    @Test
    public void test(){
        List<Person> personList = personService.SelectAll();
        for(Person person : personList){
            System.out.println(person.getName());
        }
    }

}
