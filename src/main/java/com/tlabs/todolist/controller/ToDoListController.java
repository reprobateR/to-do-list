package com.tlabs.todolist.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tlabs.todolist.entity.Tasks;

@RestController
public class ToDoListController {

	@PostMapping("/tasks")
	public ResponseEntity<String> saveTasks(@RequestBody List<Tasks> tasks) {
		
		

		return ResponseEntity.ok().body("Saved Successfully!");
	}

}
