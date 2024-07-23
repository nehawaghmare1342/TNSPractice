package DayEleven;

public class TryCatchExample {

	static void performDivision(int x , int y);
	{
		System.out.println("I am In method");
		int z;
		
		try {
			System.out.println("I am in method");
		
		z = x/y;
		System.out.println("Result of x :"+z);
	
	}catch(ArithmeticException e)
	{
		System.err.println("I am in catch block"+e.getMessage());
	}
}
}