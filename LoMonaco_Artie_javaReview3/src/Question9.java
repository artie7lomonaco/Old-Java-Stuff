import java.util.ArrayList;
public class Question9 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		ArrayList<Integer> c = new ArrayList<Integer>();
		
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				for(int k = 1; k < 10; k++) {
					if(i < j && j < k) {
						a.add(i);
						b.add(j);
						c.add(k);
					}
				}
			}
		}
		for(int l = 0; l < a.size(); l++){
			System.out.println(a.get(l) + "" + b.get(l) + "" + c.get(l));
		}
		System.out.println("The total number is " + a.size());
	}

}
