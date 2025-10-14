package WorkingPrgs;

import java.util.Arrays;

public class Merge2Arrays {
	public static void main(String[] args) {
		int[] a1= {10,20,30,40};
//		for(int i=0;i<a1.length;i++)
//		{
//			System.out.print(a1[i]+",");
//		}
		
		int[] a2 = {100,200,300};
//		for(int i=0;i<a2.length;i++)
//		{
//			System.out.print(a2[i]+",");
//		}
		
		int[] merge= getMerge(a1,a2);
		System.out.println(Arrays.toString(merge));
	}

	private static int[] getMerge(int[] a1, int[] a2) {
		int[] m = new int[a1.length+a2.length]; 
		int i=0,j=0,k=0;
		while(i<a1.length && j<a2.length)
		{
			m[k]=a1[i];
			i++;
			k++;
			m[k]=a2[j];
			j++;
			k++;
		}
		while(i<a1.length)
		{
			m[k]=a1[i];
			i++;
			k++;
		}
		while(j<a2.length)
		{
			m[k]=a2[j];
			j++;
			k++;
		}
		return m;
	}

}
