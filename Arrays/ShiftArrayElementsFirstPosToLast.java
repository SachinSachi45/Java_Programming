package impArraypgs;

import java.util.Arrays;

public class ShiftArrayElementsFirstPosToLast {
	public static void main(String[] args) {
		int[] arr = {3,5,3,2,6,7,9};
		int[] res = getArrayElements(arr);
		System.out.println(Arrays.toString(res));
	}

	private static int[] getArrayElements(int[] arr) {
		int n = arr.length;
		int temp[] = new int[n];
		int k=1;
		for(int i=0;i<arr.length;i++)
		{
			temp[(i-k+n)%n]=arr[i];
		}
		return temp;
	}

}
