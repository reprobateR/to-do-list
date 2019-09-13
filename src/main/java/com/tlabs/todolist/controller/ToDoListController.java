package com.tlabs.todolist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tlabs.todolist.entity.Tasks;
import com.tlabs.todolist.processor.TaskProcessor;

@RestController
public class ToDoListController {
	
	@Autowired
	private TaskProcessor taskProcessor;

	@PostMapping("tasks")
	public ResponseEntity<String> saveTasks(@RequestBody List<Tasks> tasks) {
		
		tasks.forEach(System.out::println);
		
		List<Tasks> createTaskItem = taskProcessor.createTaskItem(tasks);

		return ResponseEntity.ok().body("Saved Successfully!");
	}

}
