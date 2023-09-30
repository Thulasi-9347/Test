package sumofdigits;

public class SumofdigitsApp {
public static int sum(int n)
{
	int r,sum=0;
	while(n>0)
	{
		r=n%10;
		sum=sum+r;
		n=n/10;
	}
	System.out.println(sum);
	return sum;
	
}
}
