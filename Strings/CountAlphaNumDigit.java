package com.StringPrograms;

import java.util.Scanner;

public class CountAlphaNumDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		int alpha=0,digit=0,spc=0;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch>='A'&& ch<='Z' ||ch>='a'&& ch<='z')
			{
				alpha++;
			}
			else if(ch>='0'&&ch<='9')
			{
				digit++;
			}
			else
				spc++;
		}
		System.out.println("Count alphabets:"+alpha);
		System.out.println("Count Digits:"+digit);
		System.out.println("Count Special Characters:"+spc);

		
	}

}
