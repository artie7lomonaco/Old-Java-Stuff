import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a weight: ");
		int in = input.nextInt();
		int price = 0;
		if(in <= 30) {
			price = 40;
		}
		else if(in > 30 && in <= 50) {
			price = 55;
		}
		else if(in > 50 && in <= 100) {
			price = 70;
		}
		else if(in > 100) {
			price = 70 + 25*((int)((in-100.0)/50.0));
			if((in-100)%50 != 0) {
				price += 25;
			}
		}
		System.out.println("The price to send a " + in + "g letter is " + price + " sinas");
	}
}
