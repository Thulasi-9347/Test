package power;

public class PowerProgramApp {
	public void  number(int base,int exponent)
	{
		int power=1;
		for(int i=1;i<=exponent;i++)
		{
			power=power*base;//(int)math.pow(base,exponent)
		}
		System.out.println(power);
	}

}
