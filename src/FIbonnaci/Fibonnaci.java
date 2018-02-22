package FIbonnaci;

public class Fibonnaci {
	
	public int finish;
	
	public Fibonnaci()
	{
		
	}
	
	public int findFib(int one, int two, int count)
	{
		if((count != 0) && (two == 0))
		{
			System.out.println(two);
			System.out.println("Kristina Capistrano");
			return findFib(two, 1 + two, count - 1);
		}
		
	}

}
