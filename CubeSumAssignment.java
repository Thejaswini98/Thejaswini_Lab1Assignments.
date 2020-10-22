/**
 * Desc : Finding out the sum of cubes of a number
 * @author Thejaswini
 *
 */
public class CubeSumAssignment {
	public static void main(String[] args)
	{
		int result = CubeSum(123);
		System.out.println("CubeSum is :"+result);
	}

	private static int CubeSum(int num) {
		// TODO Auto-generated method stub
		int sum=0;
		while(num!=0)
		{
			int digit=num%10;
			sum+=digit*digit*digit;
			num=num/10;
			
	}
		return sum;

}
}
