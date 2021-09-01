import java.util.Scanner;


public class HelloThere {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name:");
		String userName = scanner.nextLine();
		String hello = "Hello ";
		System.out.println(hello + userName);
	}

}
