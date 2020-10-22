/**
 * 
 * @author Thejaswini
 * Desc : Traffic Lights
 *
 */
import java.util.Scanner;
public class TrafficLightAssignment {
	public static void main(String[] args)
	{
		System.out.println("Enter your light choice:\n 1.Red\n 2.Yellow\n 3.Green\n");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice)
		{
		
		case 1: System.out.println("STOP");
		break; 
		case 2: System.out.println("READY");
		break;
		case 3: System.out.println("GO");
		break;
		default : System.out.println("Enter a correct choice");
		}
	}

}
