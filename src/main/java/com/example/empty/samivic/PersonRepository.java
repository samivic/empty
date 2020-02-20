package com.example.empty.samivic;

import com.example.empty.samivic.entities.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

@Service
public interface PersonRepository extends UserRepo<Person> {

    Iterable<Person> findByAgeGreaterThan(int age);

    Iterable<Person> findByNomStartingWith(String nom);



    /* ... */ }
