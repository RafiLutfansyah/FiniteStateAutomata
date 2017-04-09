import java.util.*;

public class Deterministik {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String loop="1", q0, q1, q2, q3, q4, totalQ;
		int input=0;
		System.out.println("State q0");
		System.out.print("Input: ");
		input = scan.nextInt();
		switch(input) {
			case 1:
			while(loop.equals("1")) {
				System.out.println("State q1");
				System.out.print("Input: ");
				input = scan.nextInt();	
			}
			break;
			case 0:
			System.out.println("State q2");
			System.out.print("Input: ");
			input = scan.nextInt();
			break;
			default: System.exit(0);
		}
	}
}