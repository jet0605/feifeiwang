package com.feifei.animal.entity.dogVeriety;

import com.feifei.animal.Enum.Sex_animal;

/**
 * @author jet
 * 狗的一种品种
 * 哈士奇
 */
public class Husky {

    public int id;
    public String name;
    public int age;
    public String owner;
    public String type;
    public String from; // 动物来源地
    public int total;
    private String veriety;//品种
    private int veriety_total;//品种数量
    private Sex_animal sex;

    public Husky(){}

    public Husky(int id,String name,int age,String owner,String type,String from,int total,String veriety,int intveriety_total,Sex_animal sex){
        this.id = id;
        this.name = name;
        this.age = age;
        this.owner = owner;
        this.type = "狗";
        this.from = from;
        this.total = total;
        this.veriety = "哈士奇";
        this.veriety_total = intveriety_total;
        this.sex = sex;
    }

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

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public int getTotal() {
        return total;
    }

    public void AddTotal() {
        this.total++;
    }

    public String getVeriety() {
        return veriety;
    }

    public void setVeriety() {
        this.veriety = "哈士奇";
    }

    public int getVeriety_total() {
        return veriety_total;
    }

    public void AddVeriety_total() {
        this.veriety_total++;
    }

    public void setVeriety_total(int veriety_total) {
        this.veriety_total = veriety_total;
    }

    public Sex_animal getSex() {
        return sex;
    }

    public void setSex(Sex_animal sex) {
        this.sex = sex;
    }
}
