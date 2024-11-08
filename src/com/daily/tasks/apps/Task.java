package com.daily.tasks.apps;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 
 * @author harsha
 *
 */

public class Task {
	
	private String name;
	private boolean taskCompleted;
	private String description;
	private LocalDate taskCreatedDate;
	private LocalDate taskCompletedDate;

	
		
	/**
	 * constructor for Task initialization
	 * @param name
	 * 
	 */
	public Task(String name) {
		this.name = name;
		this.taskCompleted =false;
		this.taskCreatedDate = LocalDate.now();
		
		
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getTaskCreatedDate() {
		return taskCreatedDate;
	}

	public void setTaskCreatedDate(LocalDate taskCreatedDate) {
		this.taskCreatedDate = taskCreatedDate;
	}

	public LocalDate getTaskCompletedDate() {
		return taskCompletedDate;
	}

	public void setTaskCompletedDate(LocalDate completedDate) {
		this.taskCompletedDate = completedDate;
	}

	public void markAsCompleted()
	{
		this.taskCompleted = true;	
	}
	
	public boolean isCompleted() {
		return taskCompleted;
	}

	@Override
	public String toString() {
		return  taskCompleted? name+" created At "+taskCreatedDate+"  [  completed ]": name+" created At "+taskCreatedDate+" [  pending  ]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
