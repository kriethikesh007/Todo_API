package com.example.todo_api.service;

import java.util.List;
import com.example.todo_api.model.Todomodel;

public interface TodoService {
    public Todomodel createTodo(Todomodel task);

    List<Todomodel> getAllTodo();

    public Todomodel updateTodo(Long id, Todomodel task);

    public String deleteTodo(Long id);
}
