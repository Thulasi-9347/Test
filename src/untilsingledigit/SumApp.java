package untilsingledigit;

public class SumApp {
	public static int sum(int num)
	{
		int  sum=0;
	while(num>0||sum>9)
		{
		 if (num == 0) {
             num = sum;
             sum = 0;
         }
         sum += num % 10;
         num /= 10;			
		}
		System.out.println(sum);
		return sum;
	}

}
