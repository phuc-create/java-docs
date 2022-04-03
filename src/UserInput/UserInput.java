package UserInput;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		String name;
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Pls! input your name");
		name = scanner.nextLine();
		System.out.println("type the first number!");
		num1 = scanner.nextInt();
		System.out.println("type the second number!");
		num2 = scanner.nextInt();
		result = num1 + num2;
		
		scanner.close();
		System.out.println("your name is " + name);
		System.out.println(num1 + " + " + num2 +" = " + result);
		

	}

}
