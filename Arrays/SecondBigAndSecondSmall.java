package impArraypgs;

import java.util.Scanner;

public class SecondBigAndSecondSmall {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n =sc.nextInt();
		int[] x = new int[n];
		System.out.println("Enter"+n+" Elements");
	    for(int i=0;i<n;i++) {
	    	x[i]=sc.nextInt();
	    }
	    
	    int big = getSecondBig(x);
	    System.out.println("Second Biggest"+big);
	    int small=getSecondSmall(x);
	    System.out.println("Second Smallest"+small);
	    		
	}

	private static int getSecondSmall(int[] x) {
		int fsmall=x[0];
		int sSmall=x[1];
		for(int i=0;i<x.length;i++)
			if(x[i]<fsmall)
			{
			sSmall=fsmall;
			fsmall=x[i];
			}
			else if(x[i]<sSmall && x[i]!=fsmall)
			{
				sSmall=x[i];
			}
		return sSmall;
	}

	private static int getSecondBig(int[] x) {
		int fbig=x[0];
		int sbig=x[1];
		for(int i=0;i<x.length;i++)
		if(x[i]>fbig) {
		sbig=fbig;
		fbig=x[i];
		}
		else if(x[i]>sbig  && x[i]!=fbig)
		{
			sbig=x[i];
		}
			
		return sbig;
	}
}
