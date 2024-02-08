package br.com.victordelfino.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.victordelfino.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}
