package com.cognizant.chain;

public class ProjectManager implements ILeaveRequestHandler 
{
	private ILeaveRequestHandler nextHandler;
	
	public ProjectManager() {
		super();
	}

	public ProjectManager(ILeaveRequestHandler nextHandler) {
		super();
		this.nextHandler = nextHandler;
	}

	@Override
	public void handleRequest(LeaveRequest leaveRequest) 
	{
		// TODO Auto-generated method stub
		if (leaveRequest.getLeaveDays() <= 5)
			System.out.println("Project Manager aproves leave for " + leaveRequest);
		else
			nextHandler.handleRequest(leaveRequest);

	}

}
