package impArraypgs;

import java.util.Arrays;

public class UnionArray {

	public static void main(String[] args) {
		int[] a = {1,2,3};
		int[] b = {3,4,5};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		
		int[] union = getUnion(a,b);
		System.out.println("Union: "+Arrays.toString(union));
	}

	private static int[] getUnion(int[] a, int[] b) {

		int[] un = new int [a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			un[i]=a[i];
		}
		int in=a.length;
		
		for(int i=0;i<b.length;i++)
		{
			int j=0;
			for(;j<a.length;j++)
			{
				if(b[i]==a[j])
				break;
			}
			if(j==a.length)
				un[in++]=b[i];
		}
		int[] res = new int[in];
		for(int i=0;i<in;i++)
			res[i]=un[i];
		return res;
	}
}
