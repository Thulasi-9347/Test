package power;

import java.util.Scanner;

public class PowerProgram {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
				System.out.println("enter the number");
				int exponent=scan.nextInt();
				System.out.println("enter the power of a number");
				int base=scan.nextInt();
				PowerProgramApp b=new PowerProgramApp();
				b.number(exponent,base);

}
}