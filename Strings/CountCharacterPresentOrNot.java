import java.util.Scanner;

public class CountCharacterPresentOrNot {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the String: ");
//		String str = sc.nextLine();
//		System.out.println("Enter the Specified charater: ");
//		char ch=sc.next().charAt(0);
//		for(int i=0;i<str.length();i++)
//		{
//			char c=str.charAt(i);
//			if(str.indexOf(ch)!=-1) 
//			{
//				System.out.println("yes");
//			}
//			else {
//				System.out.println("no");
//			}
//			break;
//		}
		
		String str="abcd";
		char ch1='d';
		for(int i=0;i<str.length();i++)
		{
		char ch = str.charAt(i);
		if(str.indexOf(ch1)!=-1)
		{
			System.out.println(ch1+" Character is present");
		}
		else
			System.out.println(ch1+" Charater is not present");
		break;
		}
	}
}
