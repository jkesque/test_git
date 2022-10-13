import java.util.Scanner;

public class name {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the name");
		String name = input.nextLine();
		printName(name);
	}

	private static void printName(String name) {
		// TODO Auto-generated method stub
		System.out.println(name);
	}
}
