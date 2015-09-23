package com.betasoft.hrmsbean;

public class TimesheetBean {
	
	public String workDays;
	public String totalHours;
	public String In;
	public String Out;
	public String From;
	public String To;
	
	public TimesheetBean(String work_days , String total_hours , String in , String out , String from , String to ){
		
		this.workDays = work_days;
		this.totalHours = total_hours;
		this.In = in;
		this.Out = out;
		this.From = from;
		this.To = to;
		
	}
	
	

}
