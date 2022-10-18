import java.util.Scanner;
import java.util.ArrayList;
public class Question8 {

	public static void main(String[] args) {
		ArrayList<Integer> ms = new ArrayList<Integer>();
		ArrayList<Integer> ns = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter m: ");
		int m = input.nextInt();
		System.out.print("Enter n: ");
		int n = input.nextInt();
		for(int i = 1; i <= m; i++) {
			for(int j = 1; j <= n; j++) {
				if(i + j == 10) {
					ms.add(i);
					ns.add(j);
				}
			}
		}
		for(int k = 0; k < ms.size(); k++) {
			System.out.println(ms.get(k) + " + " + ns.get(k) + " = 10");
		}
		if (ms.size() == 1) {
			System.out.println("There is " + ms.size() + " way to get the sum 10");
		}
		else {
			System.out.println("There are " + ms.size() + " ways to get the sum 10");
		}
	}

}
