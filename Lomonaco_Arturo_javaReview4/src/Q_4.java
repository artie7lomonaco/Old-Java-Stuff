
import java.util.Scanner;
public class Q_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int in = input.nextInt();
		int[][] nums = new int[in][in];
		for(int i = 0; i < in; i++) {
			for(int j = 0; j < in; j++) {
				nums[i][j] = -1;
			}
		}
		for(int i = 0; i < in; i++) {
			nums[i][0] = i+1;
		}
		for(int i = 0; i < in; i++) {
			for(int j = 0; j < in; j++) {
				if(j == i+1) {
					nums[i][j] = 0;
				}
			}
		}
		for(int i = 0; i < in; i++) {
			for(int j = 0; j < in; j++) {
				if(j+1 < in && i+1 < in) {
					if(nums[i][j] > 0 && nums[i][j+1] == 0) {
						nums[i+1][j+1] = nums[i][j] + 1;
					}
					else if(nums[i][j] > 0 && nums[i][j+1] > 0) {
						nums[i+1][j+1] = nums[i][j] + nums[i][j+1];
					}
				}
			}
		}
		for(int i = 0; i < in; i++) {
			for(int k = 0; k < in-i; k++) {
				System.out.print(" ");
			}
			for(int j = 0; j < in; j++) {
				if (nums[i][j] != 0 && nums[i][j] != -1) {
					System.out.print(nums[i][j] + " ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
}
