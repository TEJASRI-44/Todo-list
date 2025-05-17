package com.example.in28minutes.springboot.myfirstwebapp.todo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
public class Todo {

		public Todo() {
			
		}
	public Todo(int id, String uername, String description, LocalDate targetDate, boolean done) {
		super();
		this.id = id;
		this.uername = uername;
		this.description = description;
		this.targetDate = targetDate;
		this.done = done;
	}
	@Id
	@GeneratedValue
	private int id;
	private String uername;
	@Size(min=10, message="enter atleast 10 characters")
	private String description;
	private LocalDate targetDate;
	private boolean done;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUername() {
		return uername;
	}

	public void setUername(String uername) {
		this.uername = uername;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", uername=" + uername + ", description=" + description + ", targetDate=" + targetDate
				+ ", done=" + done + "]";
	}

}
