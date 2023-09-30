package largestnumber;

public class LargestNumber {
	public static int largest(int n)
	{
		int sum=0;
			int rem=n%10;
			sum=sum*10+rem;
			 n=n/10;
		
		System.out.println(sum);
		return n;
	}

}
