package com.StringPrograms;

import java.util.Scanner;

public class PangramProgram {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
//		str=str.toLowerCase();
		if(isPangram(str))
		{
			System.out.println(" is a Pangram");
		}
		else
		{
			System.out.println(" is not a pangram");
		}
	}

	
//	private static boolean isPangram(String str) {
//		if(str.length()<26)
//		return false;
//		int[] fre = new int[26];
//		
//		
//		for(int i=0;i<str.length();i++)
//		{
//			char ch=str.charAt(i);
//			if(ch>='A' && ch<='Z')
//			{
//				fre[ch-'A']++;
//			}
//			else if(ch>='a' && ch<='z')
//			{
//				fre[ch-'a']++;
//			}
//		}
//		for(int i=0;i<26;i++)
//		{
//			if(fre[i]==0)
//				return false;
//		}
//		return true;
//		
//	}
	
	private static boolean isPangram(String str) {
		if(str.length()<26)
			return false;
		str=str.toLowerCase();
		for(char ch='a';ch<26;ch++) {
			if(str.indexOf(ch)==-1)
				return false;
		}
		
		return true;
	}


}
