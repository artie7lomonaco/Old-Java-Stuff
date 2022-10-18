

public class Q_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int zero = 0;
		int product = 0;
		int posi = 0;
		int[] list = {1,0,5,9,6,4,3,-1,0,-2,-9};
		int min = list[0];
		for(int i= 0; i < list.length; i++) {
			if(list[i] == 0) {
				zero++;
			}
			product = product*list[i];
			if(list[i] > 0) {
				posi += list[i];
			}
			if(list[i] < min) {
				min = list[i];
			}
		}
		System.out.println("The number of Zeros: " + zero);
		System.out.println("The product: " + product);
		System.out.println("The sum of all the positive numbers: " + posi);
		System.out.println("The minimum value: " + min);
		System.out.println(list[4]);

	}

}
