/**
 * 
 * @author Thejaswini 
 * Desc : To check if a number is a power of 2
 *
 */
import java.util.*;
public class PowerOfTwo {
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		System.out.println(checkNumber(n));
	}

	private static boolean checkNumber(int n) {
		// TODO Auto-generated method stub
		if(n<=0)
		{
			return false;
		}
		while(n>1) {
			if(n%2!=0)
			{
				return false;
			}
			n=n/2;
			
		}
		
		return true;
	}

}
