package JavaForLoopPatterns;
import java.util.Scanner;
public class ForLoop1 {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter no. of rows");
		int n=scn.nextInt();
		int number;
		scn.close();
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		scn.close();
	
	}

}
