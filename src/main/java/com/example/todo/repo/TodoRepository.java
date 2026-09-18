package com.example.todo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.todo.model.Todomodel;

public interface TodoRepository extends JpaRepository<Todomodel,Long>{

}
