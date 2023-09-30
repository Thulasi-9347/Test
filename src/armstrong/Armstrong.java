package armstrong;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
				System.out.println("enter  the number");
				int n=scan.nextInt();
				 ArmstrongApp a=new  ArmstrongApp();
				 a.number(n);

}
}