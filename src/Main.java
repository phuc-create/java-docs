import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		System.out.println("Hello world");
		Scanner scanner = new Scanner(System.in);
		String name = "";
		System.out.println("Typing something");
		while(name.isBlank()) {
			System.out.println("Pls typing a name");
			name = scanner.nextLine();
		}
		System.out.println("Dame! your name is: " + name);
		
		String myName = "Sam";
		System.out.println(myName.indexOf("a"));
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(21);
		numbers.add(149);
		numbers.add(2000);
		
		for(int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		Car newCar = new Car("Bugati");
		
		Garage garage = new Garage(newCar);
		
		garage.pack();
		newCar.run();
		
	}
}
