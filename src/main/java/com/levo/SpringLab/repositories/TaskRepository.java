package com.levo.SpringLab.repositories;

import com.levo.SpringLab.model.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {
    
    Task findByTitle(String title);
}
