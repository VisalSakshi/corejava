package com.edubridge.datatype;


public class TypeOfVariables {
	//instance variable
	float salary=20000.0f;
	//static variable
	static int i=10;
	String display() {
		char i='a';
		System.out.println(i);
		return "local variable";
	}
	

	public static void main(String[] args) {
		System.out.println(i);
		TypeOfVariables obj= new TypeOfVariables();
		System.out.println(obj.display());
		System.out.println(obj.salary);


	}

}
