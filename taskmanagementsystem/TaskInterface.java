package com.celcom.taskmanagementsystem;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class TaskInterface {

	static int getMainOption(Scanner sc) {
		System.out.println(
				"1)View Tasks\n2)Add New task\n3)Mark as Completed\n4)Delete Task\n5)Search For Task\n6)Terminate");
		if (sc.hasNextInt()) {
			int userInput = sc.nextInt();
			sc.nextLine(); // Consume the remaining newline character
			return userInput;
		} else {
			System.out.println("Invalid input. Please enter a number.");
			sc.nextLine(); // Consume the invalid input
			return -1; // Return a default value or prompt the user again
		}
	}

	static int getDeleteOption(Scanner sc) {
		System.out.println("1)Delete By Name\n2)Delete By Index");
		return sc.nextInt();
	}

	static Task addTask(Scanner sc) {
		System.out.println("Enter your Task :");
		String taskname = sc.nextLine();
		return new Task(taskname, false, new Date());
	}

	static Task findTask(Scanner sc, TasksList storeObject) {
		System.out.println("Enter Task Name :");
		String task = sc.next();
		for (int i = 0; i < storeObject.store.size(); i++) {
			Task object = storeObject.store.get(i);
			if (object.getName().contains(task)) {
				return object;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TaskFunctions func = new TaskFunctions();
		System.out.println("Welcome to Task Management System");
		TasksList storeObject = new TasksList(new LinkedList<Task>());
//		System.out.println(sc.hashCode());
		boolean choice = true;

		while (choice) {
			int uopt = getMainOption(sc);
			switch (uopt) {
			case 1:
				func.viewAllTasks(storeObject);
				break;
			case 2:
				Task newtask = addTask(sc);

				boolean isCreated = func.addNewtask(storeObject, newtask);
				System.out.println(isCreated ? "New Task Created Successfully." : "Task is not Created.");
				break;
			case 3:
				Task task = findTask(sc, storeObject);
				if (task != null) {
					if (func.markAsRead(storeObject, task)) {
						System.out.println("Task is Marked");
					} else {
						System.out.println("Unable to Mark Task");
					}
				} else {
					System.out.println("Unable to Find Task :(");
				}
				break;
			case 4:
				int delChoice = getDeleteOption(sc);
				switch (delChoice) {
				case 1:
					Task delTask = findTask(sc, storeObject);
					if (func.removetask(storeObject, delTask)) {
						System.out.println("Task Deleted Successfully");
					} else {
						System.out.println("Unable to Delete the Task");
					}
					break;
				case 2:
					System.out.println("Enter Deleted Task Index :");
					int index = sc.nextInt();
					if (func.removetask(storeObject, index)) {
						System.out.println("Task Deleted Successfully");
					} else {
						System.out.println("Unable to Delete the Task");
					}
					break;
				default:
					System.out.println("Invalid Option");
					break;
				}
				break;

			case 5:
				System.out.println("Enter Task :");
				String tname = sc.next();
				Task object = func.searchTask(storeObject, tname);
				if (object != null) {
					System.out.printf("%s | %s | %s", object.getName(),
							object.isCompleted() ? "Completed" : "In-Progress", object.getUpdatedDate());
				} else {
					System.out.println("Unable to find Task");
				}
				break;
			case 6:
				choice = false;
				System.out.println("Terminated");
				break;
			default:
				System.out.println("Invalid Option");
				break;
			}
			System.out.println("---------------------------------------------");
		}

		sc.close();
	}

}
