/**
 * 
 * @author Thejaswini
 * Desc : Prime numbers
 *
 */
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count,flag=0,i,j;
		System.out.println("Enter the start range: ");
		int startrange=sc.nextInt();
		System.out.println("Enter the end range: ");
		int endrange=sc.nextInt();
		
		for(i=startrange;i<=endrange;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=0;
				break;
				}
			else 
			{
				flag=1;
			}
		}
		if(flag==1)
		{
			System.out.println(i);
		}
	}
	}
}


