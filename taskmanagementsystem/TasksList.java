package com.celcom.taskmanagementsystem;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

class Task {
	private String name;
	private boolean completed;
	private Date updatedDate;

	public Task(String name, boolean completed, Date updatedDate) {
		this.name = name;
		this.completed = completed;
		this.updatedDate = updatedDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public String getUpdatedDate() {
		String date = updatedDate.getHours() + ":" + updatedDate.getMinutes() + ":" + updatedDate.getSeconds();
		return date;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
}

public class TasksList {
	public List<Task> store;

	public TasksList(List<Task> store) {
		this.store = store;
	}
}
