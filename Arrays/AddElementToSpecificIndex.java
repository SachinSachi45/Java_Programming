package impArraypgs;

import java.util.Arrays;

public class AddElementToSpecificIndex {
	public static void main(String[] args) {
		int[] a = {1,3,2,6,5};
		int[] rs = addElementIndex(a,11,4);
		if(rs!=null)
		{
				System.out.println(Arrays.toString(rs));
		}else
			System.out.println("Index out of range");
	}

	private static int[] addElementIndex(int[] a, int ele, int index) {

		if(index<0 || index > a.length)
		return null;
		int res[] = new int[a.length+1];
		res[index]=ele;
		for(int i=0;i<a.length;i++)
		{
			if(i<index)
			{
				res[i]=a[i];
			}
			else
				res[i+1]=a[i];
		}
		return res;
	}

}
