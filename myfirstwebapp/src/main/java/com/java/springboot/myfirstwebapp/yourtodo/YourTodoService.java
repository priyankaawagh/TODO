package com.java.springboot.myfirstwebapp.yourtodo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class YourTodoService {

	private static List<YourTodo> todos = new ArrayList<YourTodo>();
	private static int todosCount = 0;
	static {
		todos.add(new YourTodo(++todosCount,"Priyanka","Learn Java", LocalDate.now().plusYears(1),true));
		todos.add(new YourTodo(++todosCount,"Amit","Learn AWS", LocalDate.now().plusYears(2),false));
		todos.add(new YourTodo(++todosCount,"Priyanka","Learn DevOps", LocalDate.now().plusYears(3),true));
		todos.add(new YourTodo(++todosCount,"Priyanka","Learn Full Stack Development", LocalDate.now().plusYears(4),false));
	}
	
	public List<YourTodo> findByUserName(String userName)
	{
		return todos;
	}

	public void addTodo(String userName, String description, LocalDate plusYears, boolean b) {
		YourTodo todo = new YourTodo(++todosCount, userName, description, plusYears, b);
		todos.add(todo);
	}
}
