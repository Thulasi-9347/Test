package defaultValues;

public class DefaultNumberApp {
	public static void defaultNumber(int num)
	{
		for(int i=0;i<=5;i++)
		{
			for(int j=i+1;j<=5;j++)
			{
				if(i==j)
				{
					System.out.println("default values of a number is"+j);
				}
			}
		}
	}

}
