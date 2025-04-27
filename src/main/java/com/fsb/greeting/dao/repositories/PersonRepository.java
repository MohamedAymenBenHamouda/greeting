package com.fsb.greeting.dao.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fsb.greeting.dao.entities.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {
    Optional<Person> findPersonByName(String name);
}