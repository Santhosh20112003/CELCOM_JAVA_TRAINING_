package com.celcom.taskmanagementsystem;

import java.util.Collections;
import java.util.Date;

public class TaskFunctions {
	public void viewAllTasks(TasksList obj) {
		System.out.println("Current Tasks");
		for (int i = 0; i < obj.store.size(); i++) {
			System.out.printf("%s | %s | %s \n", obj.store.get(i).getName(),
					obj.store.get(i).isCompleted() ? "Completed" : "In-Progress", obj.store.get(i).getUpdatedDate());
		}
		System.out.println();
	}

	public boolean addNewtask(TasksList obj, Task task) {
		return obj.store.add(task);
	}

	public boolean removetask(TasksList obj, int index) {
		if (obj.store.remove(index) != null) {
			return true;
		} else {
			return false;
		}
	}

	public boolean removetask(TasksList obj, Task task) {
		if (obj.store.remove(task)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean markAsRead(TasksList obj, Task task) {
		try {
			task.setCompleted(!task.isCompleted());
			task.setUpdatedDate(new Date());
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public Task searchTask(TasksList obj, String taskname) {
		System.out.println("Task is Searching...");
		for (int i = 0; i < obj.store.size(); i++) {
			if (obj.store.get(i).getName().contains(taskname)) {
				return obj.store.get(i);
			}
		}
		return null;
	}

}
