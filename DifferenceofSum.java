/**
 * 
 * @author Thejaswini 
 * Desc : To find Difference between sum of squares and squares of sum
 *
 */
import java.util.*;
public class DifferenceofSum {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number of natural numbers");
		int num=sc.nextInt();
		System.out.println("The difference is :");
		System.out.println(calculateDifference(num));
		
	}

	private static int calculateDifference(int num) {
		// TODO Auto-generated method stub
		//sum of squares of natural numbers
		int sumsquare=(num*(num+1)*(2*num+1))/6;
		
		//sum of natural numbers
		int numsum=(num*(num+1))/2;
		
		//square of sum of natural numbers
		int squaresum=numsum*numsum;
		
		int result=sumsquare-squaresum;
		return Math.abs(result);
	}
}
