package impArraypgs;

import java.util.Scanner;

public class FindBiggest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n =sc.nextInt();
		int[] x = new int[n];
		System.out.println("Enter"+n+" element");
		for(int i=0;i<n;i++)
		{
			x[i]=sc.nextInt();
		}
		int bg=getBiggest(x);
		System.out.println(bg);
			
	}

	private static int getBiggest(int[] x) {
		int big=x[0];
		for(int i=1;i<x.length;i++)
		if(x[i]>big)
			big=x[i];
		return big;
	}

}
