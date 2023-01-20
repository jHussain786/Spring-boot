package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.UUID;

public interface PersonDao {
     default int insertPerson(Person person){
         UUID id = UUID.randomUUID();

        return 1;
    }
    int insertPerson(UUID id,Person person);
}
