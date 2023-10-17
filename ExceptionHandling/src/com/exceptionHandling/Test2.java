package com.exceptionHandling;
//checkedException :needs to be handled(mandatory)
public class Test2 {
	//checked
//    public void load(){
//    	Class.forName("com.mysql.jdbc.Driver");
//    }
    
    //Unchecked
    public void getData(){
    	System.out.println(12/0);
    }
	public static void main(String[] args) {
		Test2 t = new Test2();
		//t.load();
		t.getData();
	}

}
