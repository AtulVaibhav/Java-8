package com.Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Method reference

interface DBConnection{
	//void getDBConnection(String url,String name,String pass);
	//void getDBName();
	//int getLength(String str);
	
	
}

class Configuration{
	public void getCredentials(String url,String username,String password){
		System.out.println("Url :"+url);
		System.out.println("Username :"+username);
		System.out.println("Password :"+password);
	}
	
	public static void DBUsed(){
		System.out.println("MySql DB");
	}
}


public class Test2 {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
//		DBConnection dbConnection = ()->System.out.println("Connection Stored");
//		dbConnection.getDBConnection();
		
		//Method Reference : referring non-static method
//		DBConnection dbConnection = cfg::getCredentials;
//		String url = "jdbc:mysql://localhost:3306/db";
//		String username = "root";
//		String password = "root";
//		dbConnection.getDBConnection(url,username,password);
		
		//referring static methods
//		DBConnection dbConnection =Configuration::DBUsed;
//		dbConnection.getDBName();
		
//		DBConnection dbConnection = String::length;
//		System.out.println(dbConnection.getLength("Java"));
		
		List<String> names = Arrays.asList("Vikram S","Anuj","Anu","Rajiv");
		Collections.sort(names,Comparator.comparingInt(String::length));
        System.out.println(names);
	}

}
