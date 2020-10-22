/**
 * 
 * @author Thejaswini 
 * Desc : To check if a number is a increasing number
 *
 */
import java.util.Scanner;

public class IncreasingOrder {
	public static void main(String[] args) {
		System.out.println("Enter a number :");
		Scanner sc=new Scanner (System.in);
		int number=sc.nextInt();
		System.out.println(checkNumber(number));
	}

	private static boolean checkNumber(int number) {
		// TODO Auto-generated method stub
		
		int digit;
		int lastdigit=10;
		while(number>0) {
			digit=number%10;
			if(lastdigit<digit)
				return false;
			lastdigit=digit;
			number/=10;
			}
		return true;
			
	}

}
