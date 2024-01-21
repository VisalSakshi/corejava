package com.edubridge.datatype;
import java.util.Scanner;

public class StringBoolCharDatatype {

	public static void main(String[] args) {
	  Scanner scan=new Scanner(System.in);
	  String str=scan.nextLine();
	  System.out.println(str);
	  char a=scan.next().charAt(0);
	  System.out.println(a);
	  boolean bool=false;
	  System.out.println(bool);
	  scan.close();

	}

}
