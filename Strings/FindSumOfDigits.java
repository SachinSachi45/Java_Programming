package com.StringPrograms;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");//34ryh
		String str = sc.nextLine();
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch>'0'&& ch<='9')
				sum=sum+ch-'0';
		}
		System.out.println("Digits count is :"+sum);
	}

}
