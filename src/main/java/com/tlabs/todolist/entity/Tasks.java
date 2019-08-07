package com.tlabs.todolist.entity;

public class Tasks{

	private String task;
	private String priority;

	@Override
	public String toString() {
		return "Tasks [task=" + task + ", priority=" + priority + "]";
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public Tasks(String task, String priority) {
		this.task = task;
		this.priority = priority;
	}

	public Tasks() {

	}

}
