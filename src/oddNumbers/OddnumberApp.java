package oddNumbers;

public class OddnumberApp {
	public void oddNumbers(int n)
	{
		int res=1;
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				
				
				res=res*i;
			}
			
		}
		System.out.println(res);
	}

}
