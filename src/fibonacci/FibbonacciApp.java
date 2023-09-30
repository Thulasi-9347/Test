package fibonacci;

public class FibbonacciApp {
	public void numbers(int n)
	{
		int fib1=0,fib2=1,fib3;
		System.out.print(fib1+" "+fib2);	
		for(int i=3;i<=n;i++)
		{
			
			fib3=fib1+fib2;
			System.out.print(" "+fib3);
			fib1=fib2;
			fib2=fib3;
		}
		
	}

}
