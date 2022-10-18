import java.io.BufferedReader;
import java.io.EOFException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Question34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<String> lines = new ArrayList<String>();
		ArrayList<Integer> cals = new ArrayList<Integer>();
		String line;
		String[] type = new String[4];
		int c = 0;
		try {
			BufferedReader menu = new BufferedReader(new FileReader("menu.txt"));
			while ((line = menu.readLine()) != null) {
				try {
					lines.add(line.split(",")[1]);
					if(c%5 == 0) {
						type[(int)c/5] = (line.split(",")[0]).substring(0,((line.split(",")[0]).length()-1));
					}
				} catch(Exception e) {
					lines.add(line.split(",")[0]);
					System.out.println("uh oh 1");
				}
				c++;
			}
		} catch(Exception e) {
			
		}
		for (int i = 0; i < lines.size(); i++) {
			try {
				cals.add(Integer.parseInt((lines.get(i)).split(" ")[0]));
			} catch(Exception e) {
				cals.add(Integer.parseInt(lines.get(i)));
				System.out.println("uh oh 2");
			}
		}
		int calcount = 0;
		for (int l = 0; l*5 < lines.size(); l ++) {
			System.out.print("Please enter your " + type[l] + " choice: ");
			int in = input.nextInt();
			calcount += cals.get(l*5 + in);
		}
		System.out.println("your calorie count is " + calcount);
//		for(int j = 0; j < cals.size(); j++) {
//			System.out.println(cals.get(j) + " , " + lines.get(j));
//		}
	}
}
