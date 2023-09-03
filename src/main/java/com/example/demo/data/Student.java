package com.example.demo.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	private String name;
	@Id 
	private int id;
	private String tech;
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public String getName() {
		return name;
	}
	public void setName(String Name) {
		name = Name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [Name=" + name + ", id=" + id + ", tech=" + tech + "]";
	}
	
	
}
