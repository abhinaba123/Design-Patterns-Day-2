package com.cognizant.chain;

public class HR implements ILeaveRequestHandler 
{
	private ILeaveRequestHandler nextHandler;

	public HR() {
		super();
	}

	public HR(ILeaveRequestHandler nextHandler) {
		super();
		this.nextHandler = nextHandler;
	}

	@Override
	public void handleRequest(LeaveRequest leaveRequest) 
	{
		// TODO Auto-generated method stub
		System.out.println("HR aproves leave for " + leaveRequest);
	}

}
