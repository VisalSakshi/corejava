package com.edubridge.operator;

import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println(num<num2);
		System.out.println(num>num2);
		System.out.println(num<=num2);
		System.out.println(num>=num2);
		System.out.println(num!=num2);
		System.out.println(num==num2);
		scan.close();
	}

}
