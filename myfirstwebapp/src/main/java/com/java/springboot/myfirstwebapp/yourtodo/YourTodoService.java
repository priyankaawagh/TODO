package com.java.springboot.myfirstwebapp.yourtodo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class YourTodoService {

	private static List<YourTodo> todos = new ArrayList<YourTodo>();
	static {
		todos.add(new YourTodo(1,"Priyanka","Learn Java", LocalDate.now().plusYears(1),true));
		todos.add(new YourTodo(2,"Amit","Learn AWS", LocalDate.now().plusYears(2),false));
		todos.add(new YourTodo(3,"Priyanka","Learn DevOps", LocalDate.now().plusYears(3),true));
		todos.add(new YourTodo(4,"Priyanka","Learn Full Stack Development", LocalDate.now().plusYears(4),false));
	}
	
	public List<YourTodo> findByUserName(String userName)
	{
		return todos;
	}
}
