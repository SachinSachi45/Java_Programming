package WorkingPrgs;

import java.util.Arrays;

public class CopyArray {
	public static void main(String[] args) {
		int[] ar = {10,20,30,40};
		int[] copy = getCopy(ar);
		System.out.println(Arrays.toString(copy));
	}

	private static int[] getCopy(int[] ar) {
//		int[] c = new int[ar.length];
//		for(int i=0;i<ar.length;i++)
//		{
//			c[i]=ar[i];
//		}
		
		int[] c = ar.clone();
		return c;
	}

}
