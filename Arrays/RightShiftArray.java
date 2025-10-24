package impArraypgs;

import java.util.Arrays;

public class RightShiftArray {
	public static void main(String[] args) {
		int[] arr = {2,7,4,9,8,4};
		int[] res = getRightShiftArray(arr);
		System.out.println(Arrays.toString(res));
	}
		
		private static int[] getRightShiftArray(int[] arr) {
			int n = arr.length;
			int temp[] = new int[n];
			int k=1;
			
			for(int i=0;i<arr.length;i++)
			{
				temp[(i+k+n)%n]=arr[i];
			}
			
			return temp;
		}
		
//		Without using method
		
//		int n = arr.length;
//		
//		int temp[] = new int[n];
//		int k=1;
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			temp[(i+k+n)%n]=arr[i];
//		}
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.print(temp[i]+" ");
//		}


}
