package com.feifei.animal.dao;

import com.feifei.animal.entity.person.Person;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface PersonDao {

    List<Person> SelectAll();

}
