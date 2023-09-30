package oddNumbers;

import java.util.Scanner;



public class Oddnumbers {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
				System.out.println("enter  the number");
				int n=scan.nextInt();
				OddnumberApp a=new OddnumberApp();
				a.oddNumbers(n);
	}

}
