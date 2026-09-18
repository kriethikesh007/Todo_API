package com.example.todo_api.repo;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
import com.example.todo_api.model.Todomodel;

//@Repository
public interface TodoRepository extends JpaRepository <Todomodel, Long> {
    
}
