package Exception;

//arithmetic exception
public class Arith {

	public static void main(String[] args)
	{
		try
		{
			int a=50/0;
		}
		
		catch (ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("Hala Madrid");
	}
}
