package com.fsb.greeting.business.services;

import java.util.List;

import com.fsb.greeting.dao.entities.Person;

public interface PersonService {
    //Read opérations
    List<Person> getAllPerson();
    Person getPersonById(Long id);
    Person getPersonByName(String name);
    //create
    Person addPerson(Person person);
    //Update
    Person updatePerson(Long id,Person person);
    //Delete
    void deletePersonById(Long id);

}