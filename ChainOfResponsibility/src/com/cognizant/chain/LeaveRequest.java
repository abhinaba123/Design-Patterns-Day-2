package com.cognizant.chain;

public class LeaveRequest 
{
	private String employee;
	private int leaveDays;

	public LeaveRequest() {
		super();
	}

	public LeaveRequest(String employee, int leaveDays) {
		super();
		this.employee = employee;
		this.leaveDays = leaveDays;
	}

	public String getEmployee() {
		return employee;
	}

	public void setEmployee(String employee) {
		this.employee = employee;
	}

	public int getLeaveDays() {
		return leaveDays;
	}

	public void setLeaveDays(int leaveDays) {
		this.leaveDays = leaveDays;
	}

	@Override
	public String toString() {
		return "LeaveRequest [employee=" + employee + ", leaveDays=" + leaveDays + "]";
	}

}
