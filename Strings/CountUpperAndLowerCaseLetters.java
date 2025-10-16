package com.StringPrograms;

import java.util.Scanner;

public class CountUpperAndLowerCaseLetters {
	public static void main(String[] args) {
		String str ="Apple";
		int uc=0,lc=0;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch>='A' && ch<='Z')
				{
					uc++;
				}
				else if(ch>='a' && ch<='z')
				{
					lc++;
				}
		}
		System.out.println("UpperCase count :"+uc);
		System.out.println("LowerCase count :"+lc);

	}
}
