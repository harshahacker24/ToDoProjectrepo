package com.daily.tasks.apps;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ToDoList {

	private ArrayList<Task> tasks = new ArrayList<>();

	/**
	 * Adds a new task to the to-do list
	 * 
	 * @param name task name
	 * @author harsha
	 * @return nothing
	 */

	public void addTask(String name) {
		tasks.add(new Task(name));
		System.out.println(name + ":  task added");
	}

	/**
	 * removes a task from the to-do list
	 * 
	 * @param index indicates the task number
	 * @return nothing
	 */

	public void removeTask(int index) {
		if (index >= 0 && index < tasks.size()) {

			tasks.remove(index);
			System.out.println("task removed");

		} else
			System.out.println("invalid task number");
	}

	/**
	 * marks the task as completed
	 * 
	 * @param index
	 */

	public void markTaskCompleted(int index, String completedDate) {
		if (index >= 0 && index < tasks.size()) {
			tasks.get(index).markAsCompleted();
			tasks.get(index).setTaskCompletedDate(LocalDate.parse(completedDate));
			System.out.println(tasks.get(index).getName()+"task marked as complete and finished at"+tasks
					.get(index).getTaskCompletedDate());
			
			
		} else
			System.out.println("invalid task number");
	}

	/**
	 * shows the all tasks available in the todo list
	 */

	public void showTasks() {
		if (tasks.isEmpty())
			System.out.println("No tasks to display");
		else {
			for (int i = 0; i < tasks.size(); i++) {
				System.out.println((i + 1) + ".  " + tasks.get(i));
			}
		}
	}

	/**
	 * shows pending tasks of a user
	 * 
	 */
	public void showPendingTasks() {

		if (tasks.isEmpty())
			System.out.println("no tasks to display");
		else {
			for (Task t : tasks) {

				if (!t.isCompleted())
					System.out.println(t.getName());

			}
		}

	}
	
	public void showCompletedTasks() {

		if (tasks.isEmpty())
			System.out.println("no tasks to display");
		else {
			for (Task t : tasks) {

				if (t.isCompleted())
					System.out.println(t.getName());

			}
			System.out.println("there is no completed tasks");
		}

	}

}
