package com.tlabs.todolist.entity;

import java.util.Date;

public class Tasks{

	private long taskId;
	private String task;
	private String priority;
	private Date startDate;
	private boolean completed;
	private Date completedDate;

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

	@Override
	public String toString() {
		return "Tasks [taskId=" + taskId + ", task=" + task + ", priority=" + priority + ", startDate=" + startDate
				+ ", completed=" + completed + ", completedDate=" + completedDate + "]";
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public Date getCompletedDate() {
		return completedDate;
	}

	public void setCompletedDate(Date completedDate) {
		this.completedDate = completedDate;
	}

	public Tasks() {

	}

	public long getTaskId() {
		return taskId;
	}

	public void setTaskId(long taskId) {
		this.taskId = taskId;
	}

	
}
