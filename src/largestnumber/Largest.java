package largestnumber;

import java.util.Scanner;

public class Largest {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
				System.out.println("enter the number");
				int n=scan.nextInt();
				LargestNumber.largest(n);
	}
}
