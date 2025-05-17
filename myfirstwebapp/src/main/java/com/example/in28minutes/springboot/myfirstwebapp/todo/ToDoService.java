package com.example.in28minutes.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class ToDoService {
	private static List<Todo> todos = new ArrayList<>();
	private static int todosCount = 0;

	static {
		todos.add(new Todo(++todosCount, "in28minutes", "Get AWS Certified 1", LocalDate.now().plusYears(1), false));

		todos.add(new Todo(++todosCount, "in28minutes", "Learn Devops 1", LocalDate.now().plusYears(2), false));
		todos.add(new Todo(++todosCount, "in28minutes", "Learn  Full Stack Development 1", LocalDate.now().plusYears(3),
				false));

	}

	public List<Todo> findByUsername(String username) {
		Predicate<? super Todo> Predicate = todo -> todo.getUername().equalsIgnoreCase(username);

		return todos.stream().filter(Predicate).toList();
	}

	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		Todo todo = new Todo(++todosCount, username, description, targetDate, done);
		todos.add(todo);
	}

	public void deleteById(int id) {
		// TODO Auto-generated method stub
		// todo.id==id
		// todo->todo.getId()==id
		Predicate<? super Todo> Predicate = todo -> todo.getId() == id;

		todos.removeIf(Predicate);
	}

	public Todo findById(int id) {
		// TODO Auto-generated method stub
		Predicate<? super Todo> Predicate = todo -> todo.getId() == id;
		Todo todo=todos.stream().filter(Predicate).findFirst().get();
		return todo;
	}

	public void UpdateTodo(@Valid Todo todo) {
		// TODO Auto-generated method stub
		deleteById(todo.getId());
		todos.add(todo);
		
	}
}
