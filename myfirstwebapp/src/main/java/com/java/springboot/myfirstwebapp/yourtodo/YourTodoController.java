package com.java.springboot.myfirstwebapp.yourtodo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("userName")
public class YourTodoController {

	private YourTodoService todoService;

	public YourTodoController(YourTodoService todoService) {
		super();
		this.todoService = todoService;
	}

	@RequestMapping("todo-list")
	public String fetchYourTodoList(ModelMap model) {
		List<YourTodo> todos = todoService.findByUserName("Priyanka");
		model.addAttribute("todos", todos);
		return "listYourTodos";
	}
	
	@RequestMapping(value="add-todo", method = RequestMethod.GET)
	public String fetchAddTodoPage()
	{
		return "yourTodo";
	}
	
	@RequestMapping(value="add-todo", method = RequestMethod.POST)
	public String submitAddTodoPage(@RequestParam String description, ModelMap model)
	{
		String userName = (String) model.get("userName");
		todoService.addTodo(userName,description,LocalDate.now().plusYears(1), false);
		return "redirect:todo-list";
	}

}
