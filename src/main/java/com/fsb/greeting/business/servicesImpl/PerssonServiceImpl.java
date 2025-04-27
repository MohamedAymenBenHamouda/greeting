package com.fsb.greeting.business.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsb.greeting.business.services.PersonService;
import com.fsb.greeting.dao.entities.Person;
import com.fsb.greeting.dao.repositories.PersonRepository;
import com.fsb.greeting.web.controllers.PersonsController;

@Service
public class PerssonServiceImpl implements PersonService {
    //injection par attribut
    @Autowired
    PersonRepository personRepository;

    @Override
    public List<Person> getAllPerson() {
      return  this.personRepository.findAll();
    }

    @Override
    public Person getPersonById(Long id) {
    return this.personRepository.findById(id).orElse(null);
    }

    @Override
    public Person getPersonByName(String name) {
      return  this.personRepository.findPersonByName(name).orElse(null);
    }

    @Override
    public Person addPerson(Person person) {
        if(person==null){
             return null;
        }
        return this.personRepository.save(person);
    }

    @Override
    public Person updatePerson(Long id, Person person) {
      if(this.personRepository.existsById(id)){
        return this.personRepository.save(person);
      }else{
        return null;
      }
    }

    @Override
    public void deletePersonById(Long id) {
        if(this.personRepository.existsById(id)){
             this.personRepository.deleteById(id);
          }
    }
    
}