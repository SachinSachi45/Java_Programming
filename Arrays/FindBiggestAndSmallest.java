package WorkingPrgs;

import java.util.Arrays;

public class FindBiggestAndSmallest {
	public static void main(String[] args) {
		int[] ar = {10,8,40,100,50};
		System.out.println(Arrays.toString(ar));
		
		int res = getbiggest(ar);
		System.out.println("Biggest is "+res);
		
		int res1 = getsmallest(ar);
		System.out.println("Smallest is "+res1);
		
	}
	
	public static int getbiggest(int[] ar)
	{
		int big = ar[0];
		
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i]>big)
			{
				big=ar[i];
			}
		}
		
		return big;
	}
	
	private static int getsmallest(int[] ar) {

		int small = ar[0];
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i]<small)
			{
				small=ar[i];
			}
		}
		return small;
	}

}
