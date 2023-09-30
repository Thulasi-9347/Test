package armstrongRange;

public class ArmRangeApp {
	public static int armstrong(int n)
	{
		int r,sum=0;
		int temp=n;
		for(int i=1;i<=0;i++)
		{
			while(n>0)
			{
				r=n%10;
				n=n/10;
				sum=sum+r*r*r;
			}
			if(temp==sum)
				System.out.println(sum);
		
		}
		return temp;
		
	}

}
