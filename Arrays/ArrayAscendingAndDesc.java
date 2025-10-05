package impArraypgs;

import java.util.Arrays;

public class ArrayAscendingAndDesc {
	public static void main(String[] args) {
		int[] ar = {12,5,8,1,9};
		System.out.println(Arrays.toString(ar));
		
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));//1,5,8,9,12
		
		int f=0,l=ar.length-1;
		while(f<l) {
		int temp=ar[f];
		ar[f]=ar[l];
		ar[l]=temp;
		f++;
		l--;
		}
		System.out.println(Arrays.toString(ar));//12,9,8,5,1
	}

}
