package reverseNumber;

public class ReverseApp {
	public static void value(int num)
	{
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		System.out.println(sum);
	}

}
