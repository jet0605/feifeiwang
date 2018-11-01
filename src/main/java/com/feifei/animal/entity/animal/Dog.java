package com.feifei.animal.entity.animal;

import com.feifei.animal.Enum.Sex_animal;
import com.feifei.animal.entity.factory.Animal;

/**
 * @author jet
 * 狗
 */
public class Dog extends Animal {

    public int id;
    public String name;
    public int age;
    public String owner;
    public String type;
    public String from; // 动物来源地
    public int total;
    public Sex_animal sex;

    public Dog(int id,String name,int age,String owner,String type,String from,int total,Sex_animal sex){
        super(id,name,age,owner,type,from,total,sex);
        this.type = "狗";
    }

    public Dog(){ }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getType() {
        return type;
    }

    public void setType() {
        this.type = "狗";
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    @Override
    public int getTotal() {
        return total;
    }

    public void AddTotal() {
        total++;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Sex_animal getSex() {
        return sex;
    }

    public void setSex(Sex_animal sex) {
        this.sex = sex;
    }
}
