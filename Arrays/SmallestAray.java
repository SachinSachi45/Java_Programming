package impArraypgs;

import java.util.Scanner;

public class SmallestAray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n =sc.nextInt();
		int[] x = new int[n];
		System.out.println("Enter the"+n+" elements");
		for(int i=0;i<n;i++)
		{
			x[i]=sc.nextInt();
		}
		
		int sm=getSmallest(x);
				System.out.println(sm);
	}

	private static int getSmallest(int[] x) {
		int small=x[0];
		for(int i=1;i<x.length;i++)
		if(x[i]<small)
			small=x[i];
		return small;
	}
}
