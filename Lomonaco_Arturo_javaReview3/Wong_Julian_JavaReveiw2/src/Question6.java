import java.util.Scanner;
public class Question6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a integer: ");
		int in = input.nextInt();
		int pow = 0;
		int val = 0;
		while(val < in) {
			pow++;
			val = (int)Math.pow(2, pow);
		}
		System.out.println(val + " = 2^" + pow + " is the smallest power of two greater than or equal to " + in);
	}

}
