package WorkingPrgs;

import java.util.Arrays;
import java.util.Scanner;

public class CountFrequency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n = sc.nextInt();
		int[] ar = new int[n];
		System.out.println("Enter the "+n+" array elements: ");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
//		int[] ar= {10,20,10,30,30,50,40,40,10};
//		System.out.println(Arrays.toString(ar));
		boolean[] bool = new boolean[ar.length];
		
		for(int i=0;i<ar.length;i++)
		{
			if(bool[i]==false) 
			{
				int count=1;
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					count++;
					bool[j]=true;
				}
			}
			
			    System.out.println(ar[i]+"----->"+count);
		   }
	   }
  }
	}

