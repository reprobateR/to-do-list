package com.tlabs.todolist.processor;

import java.util.Calendar;
import java.util.List;

import org.springframework.stereotype.Component;

import com.tlabs.todolist.entity.Tasks;

@Component
public class TaskProcessor {

	public List<Tasks> createTaskItem(List<Tasks> tasks) {
		
		tasks.stream().map(t -> setupData(t));
		
		
		
		return null;	
	}

	private Object setupData(Tasks task) {
		
		
		return null;
	}
	
}
