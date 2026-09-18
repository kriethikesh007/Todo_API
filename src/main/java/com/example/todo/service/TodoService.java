package com.example.todo.service;

import java.util.List;
import com.example.todo.model.Todomodel;

public interface TodoService {
    public Todomodel createTodo(Todomodel task);

    public List<Todomodel> getAllTodo();

    public Todomodel updateTodo(Long id, Todomodel task);

    public String deleteTodo(Long id);
}
