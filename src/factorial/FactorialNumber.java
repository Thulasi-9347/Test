package factorial;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
				System.out.println("enter the number");
				int n=scan.nextInt();
				FactorialNumberApp.factorial(n);
}
}