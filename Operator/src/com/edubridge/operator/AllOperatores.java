package com.edubridge.operator;

import java.util.Scanner;

public class AllOperatores {

	public static void main(String[] args) {
		//arithmetic operator
		Scanner scan= new Scanner(System.in);
		int num=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println(num+num2);
		System.out.println(num-num2);
		System.out.println(num*num2);
		System.out.println(num/num2);
		System.out.println(num%num2);
		
		
		
		scan.close();
		
		

	}

}
