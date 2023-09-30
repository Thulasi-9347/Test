package defaultValues;

import java.util.Scanner;

public class DefaultNumbers {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scanner.nextInt();
		DefaultNumberApp.defaultNumber(num);
	}

}
