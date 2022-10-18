

public class Q_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int multi = 0;
		int[][] table = {{4,6,-4,23},{9,22,-34,46},{5,7,-1,-4}};
		int max = table[0][0]; 
		int min = table[0][0]; 
		for(int i = 0; i < table.length; i++) {
			for(int j = 0; j < table[0].length; j++) {
				sum += table[i][j];
				if(table[i][j]%3 == 0) {
					multi++;
				}
				if(table[i][j] < min) {
					min = table[i][j];
				}
				if(table[i][j] > max) {
					max = table[i][j];
				}
			}
		}
		System.out.println("Number of elements: " + (table.length*table[0].length));
		System.out.println("The sum: " + sum);
		System.out.println("The number of mutiples of 3: " + multi);
		System.out.println("The largest difference: " + (max - min));

	}

}
