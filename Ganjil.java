import java.util.*;

public class Latihan2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String loop, q0, q1, q2, q3, q4, totalQ;
		int input=0;
		System.out.println("State q0");
		System.out.print("Input: ");
		input = scan.nextInt();
		if(input==1 || input==0){
			System.out.println("State q1");
			System.out.print("Input: ");
			input = scan.nextInt();
			if(input==1)
			for(loop="q2"; loop.equals("q2") || loop.equals("Q2");) {
				System.out.println("State q2");
				System.out.print("Input: ");
				input = scan.nextInt();
				if(input==0) {
					System.out.println("State q4");
					System.out.println("Finish");
				}
			}
			if(input==0)
			for(loop="q3"; loop.equals("q3") || loop.equals("Q3");) {
				System.out.println("State q3");
				System.out.print("Input: ");
				input = scan.nextInt();
				if(input==1) {
					System.out.println("State q4");
					System.out.println("Finish");
				}
			}
		}
	}
}