package com.auth.example.repository;


import com.auth.example.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> {

    public Person findByEmail(String email);
    public Person findById(String email);


}
