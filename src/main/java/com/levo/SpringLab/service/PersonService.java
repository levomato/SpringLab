package com.levo.SpringLab.service;

import com.levo.SpringLab.model.Person;
import com.levo.SpringLab.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public List<Person> findAll() {
        return (List<Person>) personRepository.findAll();
    }

    public Person getPersonById(int id) {
        if(personRepository.findById(id).isPresent())
        return personRepository.findById(id).get();

        return null;
    }

    public void saveOrUpdate(Person person) {
        personRepository.save(person);
    }

    public void delete(int id) {
        personRepository.deleteById(id);
    }
}
