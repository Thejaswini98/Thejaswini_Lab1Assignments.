/**
 * 
 * @author Thejaswini
 * Desc : Calculating the sum of first n natural numbers that are divisible by 3 or 5
 *
 */
import java.util.*;
public class CalculateSum {
	static int calulateSum(int n)
	{
		int s1,s2,s3;
        s1=((n/3))*(2*3+(n/3-1)*3)/2;
        s2=((n/5))*(2*5+(n/5-1)*5)/2;
        s3=((n/15))*(2*15+(n/15-1)*15)/2;
        int sum=s1+s2-s3;
        return sum;
        
	}

	public static void main(String[] args) {
		System.out.println("Enter the number of natural numbers");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(calulateSum(n));
	}
}
