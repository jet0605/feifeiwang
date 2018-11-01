package com.feifei.animal.service.Impl;

import com.feifei.animal.dao.PersonDao;
import com.feifei.animal.entity.person.Person;
import com.feifei.animal.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonDao personDao;


    @Override
    public List<Person> SelectAll() {
       return personDao.SelectAll();
    }
}
