import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the model number of your car: ");
		int in = input.nextInt();
		if (in == 119 || in == 179 || (in >=189 && in <=195) || in == 221 || in == 780){
			System.out.println("Your car is defective.");
		}
		else {
			System.out.println("Your car is not defective.");
		}
	}

}
