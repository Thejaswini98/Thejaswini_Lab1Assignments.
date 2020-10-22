/**
 * 
 * @author Thejaswini 
 * Desc : Fibonacci with recursion
 *
 */
import java.util.Scanner;
public class FibonacciSequenceRecursion {
	static int num1=1,num2=1,num3;
	
	static void printFibonacci(int num) {
		if(num>0)
		{
			num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.println(""+num3);
			printFibonacci(num-1);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num of fibonacci numbers required");
		int num=sc.nextInt();
		System.out.println(num1+"\n"+num2);
		printFibonacci(num);
	}

}
