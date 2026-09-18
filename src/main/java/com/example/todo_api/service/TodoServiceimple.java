package com.example.todo_api.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.todo_api.model.Todomodel;
import com.example.todo_api.repo.TodoRepository;

@Service
public class TodoServiceimple implements TodoService {
    private TodoRepository todoRepo;

    public TodoServiceimple(TodoRepository todoRepo) {
        this.todoRepo = todoRepo;
    }

    @Override
    public Todomodel createTodo(Todomodel task) {
        return todoRepo.save(task);
    }

    @Override
    public List<Todomodel> getAllTodo() {
        return todoRepo.findAll();
    }

    @Override
    public Todomodel updateTodo(Long id, Todomodel task) {
        Todomodel exTodo = todoRepo.findById(id).orElse(null);
        if (exTodo == null)
            return null;
        exTodo.setTask(task.getTask());
        return todoRepo.save(exTodo);
    }

    @Override
    public String deleteTodo(Long id) {
        todoRepo.deleteById(id);
        return "your task is deleted";
    }
}
