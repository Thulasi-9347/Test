package primeNumbers;

public class PrimeNumbersApp {
public static int numbers(int a)
{
	int count=0;
	for(int i=1;i<=a;i++)
	{
		count=0;
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
				count++;
		}
		if(count==2)
		{
			System.out.println(i);
		}
	}

	return a;
}
}
