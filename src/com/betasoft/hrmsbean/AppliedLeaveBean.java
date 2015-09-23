package com.betasoft.hrmsbean;

public class AppliedLeaveBean {
	public String employeeID;
	public String employeeName;
	public String leaveType;
	public String leaveFrom;
	public String leaveTo;
	public String totalDays;
	public String requestedOn;
	public String leaveStatus;
	public String action;
	
	public AppliedLeaveBean(String employeeID,String employeeName , String leaveType , String leaveFrom , String leaveTo , String totalDays , String requestedOn ,String leaveStatus , String action){
		this.employeeID=employeeID;
		this.employeeName = employeeName;
		this.leaveType = leaveType;
		this.leaveFrom = leaveFrom;
		this.leaveTo = leaveTo;
		this.totalDays = totalDays;
		this.requestedOn = requestedOn;
		this.leaveStatus = leaveStatus;
		this.action = action;
	}
}
