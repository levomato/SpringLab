package com.levo.SpringLab.repository;

import com.levo.SpringLab.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {

}
