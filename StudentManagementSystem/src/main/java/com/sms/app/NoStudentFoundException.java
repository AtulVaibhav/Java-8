package com.sms.app;

public class NoStudentFoundException extends Exception {
    private String msg;

	public NoStudentFoundException(String msg) {
		super();
		this.msg = msg;
	}
    public String getErrorMsg(){
    	return this.msg;
    }
}
