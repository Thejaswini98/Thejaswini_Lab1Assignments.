/**
 * 
 * @author Thejaswini
 * Desc: Fibbonacci using recursion
 *
 */
public class FibbonacciSequence {

	public static void main(String[] args) {
		int firstnum=1,secondnum=1,thirdnum;
		int count=20;
		System.out.println(firstnum+"\n"+secondnum);
		for(int i=2;i<count;i++)
		{
			thirdnum=firstnum+secondnum;
			System.out.println(""+thirdnum);
			firstnum=secondnum;
			secondnum=thirdnum;
		}
		
	}
}
