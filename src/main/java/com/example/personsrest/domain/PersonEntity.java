package com.example.personsrest.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
public class PersonEntity implements Person {
    String id;
    String name;
    String city;
    int age;
    //List<String> groupId;

    public PersonEntity(String name, int age, String city) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.age = age;
        this.city = city;
        //this.groupId = groupId;
    }

    @Override
    public boolean isActive() {
        return false;
    }

    @Override
    public void setActive(boolean active) {

    }

    @Override
    public List<String> getGroups() {
        return null;
    }

    @Override
    public void addGroup(String groupId) {

    }

    @Override
    public void removeGroup(String groupId) {

    }
}