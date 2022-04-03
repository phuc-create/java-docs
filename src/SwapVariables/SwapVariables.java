package SwapVariables;

public class SwapVariables {

	public static void main(String[] args) {
		String a = "should equal to b";
		String b = "shoud equal to a";
		String c = "";
		
		c = a;
		a = b;
		b = c;
		c = "";
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
