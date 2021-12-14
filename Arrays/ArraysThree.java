package Arrays;
import java.util.Arrays;
public class ArraysThree {

	public static void main(String[] args) 
	{
		int []m= {25,67,87,99,00,98};
		int[] n=new int[4];
		int []destination=new int[m.length];
		
		System.arraycopy(m,0,destination,0,m.length);
		System.out.println(Arrays.toString(destination));
		System.arraycopy(m, 2, destination, 0, 4);
		System.out.println(Arrays.toString(destination));

	}

}
