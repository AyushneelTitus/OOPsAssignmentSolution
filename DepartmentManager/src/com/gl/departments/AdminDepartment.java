package com.gl.departments;

public class AdminDepartment extends SuperDepartment {

	public AdminDepartment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String departmentName() {
		return "Admin Department";
	}

	@Override
	public String getTodaysWork() {
		return "Complete your documents Submission";
	}

	@Override
	public String getWorkDedline() {
		return "Complete by EOD";
	}

}
