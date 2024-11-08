package com.daily.tasks.apps;

import java.util.Scanner;

public class ToDoListApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ToDoList toDoList = new ToDoList();
		boolean running = true;

		System.out.println("\nTo-Do List Options:");
		System.out.println("1. Add Task");
		System.out.println("2. Remove Task");
		System.out.println("3. Mark Task as Complete");
		System.out.println("4. View Tasks");
		System.out.println("5. view pending tasks ");
		System.out.println("6. view completed tasks ");
		System.out.println("7. Exit");
		System.out.print("Choose an option: ");

		while (running) {

			int choice = scanner.nextInt();
			switch (choice) {

			case 1:
				System.out.println("enter your task to add");
				scanner.nextLine();
				String taskName = scanner.nextLine();
				toDoList.addTask(taskName);
				break;

			case 2:
				System.out.println("enter task number to remove");
				int taskNumber = scanner.nextInt() - 1;
				toDoList.removeTask(taskNumber);
				break;

			case 3:
				System.out.println("enter the task number to mark as complete");
				int completeIndex = scanner.nextInt() - 1;
				scanner.nextLine();
				System.out.println("enter the completion date");
				String completionDate = scanner.nextLine();
				toDoList.markTaskCompleted(completeIndex, completionDate);
				break;
			case 4:
				toDoList.showTasks();
				break;

			case 5:
				System.out.println(" pending tasks are");
				toDoList.showPendingTasks();
				break;
				
			case 6:
				System.out.println(" completed tasks are");
				toDoList.showCompletedTasks();
				break;

			case 7:
				running = false;
				System.out.println("exiting from the  To-Do list App");
				break;

			default:
				System.out.println("Invalid option try again");

			}

		}

	}

}
