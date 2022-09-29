package com.orthofx.task;

import com.orthofx.task.Branch;

public class Student {
	
	private int id;
	private String name;
	private Branch branch;
	
	public Student(int id, String name, Branch branch) {
		this.id = id;
		this.name = name;
		this.branch = branch;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getBranchName() {
		return branch.getName();
	}

}
