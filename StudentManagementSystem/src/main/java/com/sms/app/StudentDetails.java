package com.sms.app;

public class StudentDetails {
    private int studentId;
    private String studentName;
    private String courseEnrolled;
    private String contact;
    
    StudentDetails(){
    	super();
    }
    
    StudentDetails(int studentId,String studentName,String courseEnrolled,String contact){
    	this.studentId = studentId;
    	this.studentName = studentName;
    	this.courseEnrolled = courseEnrolled;
    	this.contact = contact;
    }

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourseEnrolled() {
		return courseEnrolled;
	}

	public void setCourseEnrolled(String courseEnrolled) {
		this.courseEnrolled = courseEnrolled;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "StudentDetails [studentId=" + studentId + ", studentName=" + studentName + ", courseEnrolled="
				+ courseEnrolled + ", contact=" + contact + "]";
	}
    
    
    
    
    
    
    
    
}
