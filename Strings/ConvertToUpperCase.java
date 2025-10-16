package com.StringPrograms;

public class ConvertToUpperCase {
	public static void main(String[] args) {
		String str = "Raghu";
		
		String cs = toCapital(str);
		System.out.println(cs);
	}

	private static String toCapital(String st) {

		char[]ch=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
		if(ch[i]>='a' && ch[i]<='z')
		{
			ch[i]=(char)(ch[i]-32);
		}
		}
		return new String(ch);
	}


}
