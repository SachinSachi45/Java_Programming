import java.util.Arrays;

public class CountFrequency {
	public static void main(String[] args) {
		int[] ar= {10,20,10,30,40,40,10};
		System.out.println(Arrays.toString(ar));
		boolean[] b= new boolean[ar.length];
		
		int fre=getFre(ar,b);
		System.out.println(fre);
	}

	private static int getFre(int[] ar, boolean[] b) {
		for(int i=0;i<ar.length;i++)
		{
			if(b[i]==false)
			{
				int count=1;
				for(int j=i+1;j<ar.length;j++)
				{
					if(ar[i]==ar[j])
					{
					count++;
					b[j]=true;
					}
				}
				System.out.println(ar[i]+"---->"+count);
			}
		}
		return 0;
	}

}
