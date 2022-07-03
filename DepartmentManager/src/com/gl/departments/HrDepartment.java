package com.gl.departments;

public class HrDepartment extends SuperDepartment {

	public HrDepartment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String departmentName() {
		return "Hr Department";
	}

	@Override
	public String getTodaysWork() {
		return "Fill today's worksheet and mark your attendance";
	}

	@Override
	public String getWorkDedline() {
		return "Complete by EOD";
	}

	public String doActivity() {
		return "Team Lunch";
	}
}
