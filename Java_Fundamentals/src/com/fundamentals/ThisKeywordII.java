package com.fundamentals;
//1.to diffentiate between instance variable and local variable when 
// there is a naming confliction.

class StudentData{
	int studentId;
	String studentName;
	StudentData(int studentId,String studentName){
		this.studentId = studentId;
		this.studentName = studentName;
	}
	public void show(){
		System.out.println("Id:"+studentId+" Name:"+studentName);
	}
}
public class ThisKeywordII {

	public static void main(String[] args) {
		StudentData obj = new StudentData(101,"Ankit");
		obj.show();

	}

}
