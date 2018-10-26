package com.feifei.animal.entity;

import com.feifei.animal.Enum.Sex;

/**
 * @author jet
 */
public class Person {

    private int id;
    private String name;
    private String password;
    private int priority ;
    private String photo;
    private String QEcode;
    private Sex Sex;
    private String address;
    private String phone;
    private String mail;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getQEcode() {
        return QEcode;
    }

    public void setQEcode(String QEcode) {
        this.QEcode = QEcode;
    }

    public com.feifei.animal.Enum.Sex getSex() {
        return Sex;
    }

    public void setSex(com.feifei.animal.Enum.Sex sex) {
        Sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
