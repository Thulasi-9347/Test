package fibonacci;

import java.util.Scanner;

public class Fibbonacci {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
				System.out.println("enter the number");
				int n=scan.nextInt();
				FibbonacciApp a= new FibbonacciApp();
				a.numbers(n);

}
}