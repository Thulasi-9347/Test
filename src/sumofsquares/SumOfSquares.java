package sumofsquares;

public class SumOfSquares {
public static int sumOfSqaures(int num)
{
	int count=0;
	for(int i=1;i<=num;i++)
	{
		count+=(i*i);
		
	}
	System.out.println(count);
	return count;
}
}
