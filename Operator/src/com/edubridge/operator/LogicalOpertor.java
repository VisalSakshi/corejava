package com.edubridge.operator;

import java.util.Scanner;

public class LogicalOpertor {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(a==3&&a<b);
		System.out.println(a==3||a<b);
		System.out.println(!(a<b));
		
		//tritory operator
		System.out.println(a==b?"even":"odd");
		scan.close();
		

	}

}
