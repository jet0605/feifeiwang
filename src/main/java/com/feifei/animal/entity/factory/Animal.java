package com.feifei.animal.entity.factory;

import com.feifei.animal.Enum.Sex_animal;

/**
 * 动物的总类
 * @author jet
 */
public abstract class Animal {
    public int id;
    public String name;
    public int age;
    public String owner;
    public String type;
    public String from; // 动物来源地
    public int total;
    public Sex_animal sex;

    public Animal(){

    }

    public Animal(int id,String name,int age,String owner,String type,String from,int total,Sex_animal sex){
        this.id = id;
        this.name = name;
        this.age = age;
        this.owner = owner;
        this.type = type;
        this.from = from;
        this.total = total;
        this.sex = sex;
    }

    public int getTotal(){
        return total;
    }

    public void AddTotal(){
        total++;
    }
}

