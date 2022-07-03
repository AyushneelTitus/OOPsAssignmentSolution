package com.gl.departments;

public abstract class SuperDepartment {
	public SuperDepartment() {
		// TODO Auto-generated constructor stub
	}

	public String departmentName() {
		return "Super Department";
	}

	public String getTodaysWork() {
		return "No work as of now";
	}

	public String getWorkDedline() {
		return "Nil";
	}

	public String isTodayAHoliday() {
		return "Today is not a Holiday";
	}
}
