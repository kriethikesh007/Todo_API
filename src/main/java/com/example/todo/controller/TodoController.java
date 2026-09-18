package com.example.todo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.todo.model.Todomodel;
import com.example.todo.service.TodoService;

@RestController
// http://localhost:8080/todos

@RequestMapping("/todos")

public class TodoController {
    private TodoService todoSer;

    public TodoController(TodoService todoSer) {
        this.todoSer = todoSer;
    }

    // http://localhost:8080/todos/createTodo
    @PostMapping("/createTodo")
    public Todomodel createTodo(@RequestBody Todomodel task) {
        return todoSer.createTodo(task);
    }

    // http://localhost:8080/todos/getAlltodo
    @GetMapping("/getAlltodo")
    public List<Todomodel> getAllTodo() {
        return todoSer.getAllTodo();
    }

    // http://localhost:8080/todos/updateTodo
    @PutMapping("/updateTodo/{id}")
    public Todomodel updateTodo(@PathVariable Long id, @RequestBody Todomodel task) {
        return todoSer.updateTodo(id, task);
    }

    // http://localhost:8080/todos/deleteTodo
    @DeleteMapping("/deleteTodo/{id}")
    public String deleteTodo(@PathVariable Long id) {
        return todoSer.deleteTodo(id);
    }
}
