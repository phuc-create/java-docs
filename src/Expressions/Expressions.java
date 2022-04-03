package Expressions;

public class Expressions {

	public static void main(String[] args) {
		// TODO : Math expressions
		int number = 10;
		int plus = 100;
		int devide = 100;
		int minus = 100;
		int time = 100;
		for(int i = 1;i <= number;i++) {
			plus++;
			devide /= i;
			minus--;
			time *= i;
		}
		System.out.println(plus);
		System.out.println(devide);
		System.out.println(minus);
		System.out.println(time);

	}

}
