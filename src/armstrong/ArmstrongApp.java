package armstrong;

public class ArmstrongApp {
	public void number(int n)
	{int r,sum=0;
	int temp=n;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=sum+r*r*r;
		}
		if(temp==sum)
			System.out.println("it is an armstrong number");
		else
			System.out.println("it is not an armstrong number");
	}

}
