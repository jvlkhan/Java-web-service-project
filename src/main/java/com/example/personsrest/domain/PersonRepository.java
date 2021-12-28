package com.example.personsrest.domain;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PersonRepository {
    Optional<Person> findById(String id);
    List<Person> findAll();
    Page<Person> findAllByNameContainingOrCityContaining(String name, String city, Pageable pageable);

    void deleteAll();

    Person save(Person person);
}
