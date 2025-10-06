package com.StringPrograms;

import java.util.Scanner;

public class AnagramProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s1 = sc.nextLine();
		s1=s1.toLowerCase();
		s1=s1.replace(" ", "");
		System.out.println("Enter the String: ");
		String s2 = sc.nextLine();
		s2=s2.toLowerCase();
		s2=s2.replace(" ", "");
		
		if((isAnagram(s1,s2)))
		{
		System.out.println(s1+" "+s2+" are Anagram");
		}
		else
		{
			System.out.println(s1+" "+s2+" are not Anagram");
		}
		
	}

	private static boolean isAnagram(String s1, String s2) {

		int[] freq = new int[26];
		
		for(int i=0;i<s1.length();i++)
		{
			
			char ch = s1.charAt(i);
			freq[ch-'a']++;
		}
		
		for(int i=0;i<s2.length();i++)
		{
			char ch = s2.charAt(i);
			freq[ch-'a']--;
		}
		
		for(int i=0;i<26;i++)
		{
		   if(freq[i]!=0)
		   {			   
			   return false;
		   }
		}
		return true;
	}

}
