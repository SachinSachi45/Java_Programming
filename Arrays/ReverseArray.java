package WorkingPrgs;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int[] ar = {10,20,30,40,50};
		int[] rev = getReverse(ar);
		System.out.println(Arrays.toString(ar));
	}

	private static int[] getReverse(int[] ar) {
		int f=0,l=ar.length-1;
		while(f<l)
		{
			int temp=ar[f];
			ar[f]=ar[l];
			ar[l]=temp;
			f++;
			l--;
		}
		return ar;
	}

}
