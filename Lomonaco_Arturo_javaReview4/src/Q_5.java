
import java.util.Scanner;
public class Q_5 {
public static int[][] mines;
public static int[][]output;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = input.nextInt();
		System.out.print("Enter m: ");
		int m = input.nextInt();
		int[][] mines = new int[n][m];
		int[][] output = new int[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				mines[i][j] = (int) Math.round(Math.pow(Math.random(),.3));
				if(mines[i][j] == 0) {
					mines[i][j] = 1;
				}
				else if(mines[i][j] == 1) {
					mines[i][j] = 0;
				}
				output[i][j] = 0;
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				int out = 0;
				int x = i;
				int y = j;
				int h = n-1;
				int l = m-1;
				if(x == 0 && y == 0) {
					if (mines[x][y+1] == 1) {
						out++;
					}
					if (mines[x+1][y+1] == 1) {
						out++;
					}
					if (mines[x+1][y] == 1) {
						out++;
					}
				}
				else if(x == 0 && y == l) {
					if (mines[x][y-1] == 1) {
						out++;
					}
					if (mines[x+1][y-1] == 1) {
						out++;
					}
					if (mines[x+1][y] == 1) {
						out++;
					}
				}
				else if(x == h && y == 0) {
					if (mines[x-1][y] == 1) {
						out++;
					}
					if (mines[x-1][y+1] == 1) {
						out++;
					}
					if (mines[x][y+1] == 1) {
						out++;
					}
				}
				else if(x == h && y == l) {
					if (mines[x-1][y] == 1) {
						out++;
					}
					if (mines[x-1][y-1] == 1) {
						out++;
					}
					if (mines[x][y-1] == 1) {
						out++;
					}
				}
				else if(x == 0) {
					if (mines[x][y+1] == 1) {
						out++;
					}
					if (mines[x+1][y+1] == 1) {
						out++;
					}
					if (mines[x+1][y] == 1) {
						out++;
					}
					if (mines[x][y-1] == 1) {
						out++;
					}
					if (mines[x+1][y-1] == 1) {
						out++;
					}
				}
				else if(x == l) {
					if (mines[x][y+1] == 1) {
						out++;
					}
					if (mines[x-1][y+1] == 1) {
						out++;
					}
					if (mines[x-1][y] == 1) {
						out++;
					}
					if (mines[x][y-1] == 1) {
						out++;
					}
					if (mines[x-1][y-1] == 1) {
						out++;
					}
				}
				else if(y == 0) {
					if (mines[x-1][y] == 1) {
						out++;
					}
					if (mines[x-1][y+1] == 1) {
						out++;
					}
					if (mines[x][y+1] == 1) {
						out++;
					}
					if (mines[x+1][y] == 1) {
						out++;
					}
					if (mines[x+1][y+1] == 1) {
						out++;
					}
				}
				else if(y == h) {
					if (mines[x-1][y] == 1) {
						out++;
					}
					if (mines[x-1][y-1] == 1) {
						out++;
					}
					if (mines[x][y-1] == 1) {
						out++;
					}
					if (mines[x+1][y] == 1) {
						out++;
					}
					if (mines[x+1][y-1] == 1) {
						out++;
					}
				}
				else {
					if (mines[x-1][y] == 1) {
						out++;
					}
					if (mines[x-1][y-1] == 1) {
						out++;
					}
					if (mines[x][y-1] == 1) {
						out++;
					}
					if (mines[x+1][y] == 1) {
						out++;
					}
					if (mines[x+1][y-1] == 1) {
						out++;
					}
					if (mines[x-1][y+1] == 1) {
						out++;
					}
					if (mines[x][y+1] == 1) {
						out++;
					}
					if (mines[x+1][y+1] == 1) {
						out++;
					}
				}
				output[i][j] = out;
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(mines[i][j] == 1) {
					System.out.print("* ");
				}
				else if(mines[i][j] == 0) {
					System.out.print(". ");
				}
			}
			System.out.println();
		}
		System.out.println("");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println();
		}
	}
}
//	public static int scan(int x, int y, int l, int h) {
//		int out = 0;
//		l--;
//		h--;
//		System.out.println(x + ", " + y);
//		for(int i = 0; i < l+1; i++) {
//			for(int j = 0; j < h+1; j++) {
//				System.out.print(mines[i][j] + " ");
//			}
//			System.out.println();
//		}
//		if(x == 0 && y == 0) {
//			if (mines[x][y+1] == 1) {
//				out++;
//			}
//			if (mines[x+1][y+1] == 1) {
//				out++;
//			}
//			if (mines[x+1][y] == 1) {
//				out++;
//			}
//		}
//		else if(x == 0 && y == l) {
//			if (mines[x][y-1] == 1) {
//				out++;
//			}
//			if (mines[x+1][y-1] == 1) {
//				out++;
//			}
//			if (mines[x+1][y] == 1) {
//				out++;
//			}
//		}
//		else if(x == h && y == 0) {
//			if (mines[x-1][y] == 1) {
//				out++;
//			}
//			if (mines[x-1][y+1] == 1) {
//				out++;
//			}
//			if (mines[x][y+1] == 1) {
//				out++;
//			}
//		}
//		else if(x == h && y == l) {
//			if (mines[x-1][y] == 1) {
//				out++;
//			}
//			if (mines[x-1][y-1] == 1) {
//				out++;
//			}
//			if (mines[x][y-1] == 1) {
//				out++;
//			}
//		}
//		else if(x == 0) {
//			if (mines[x][y+1] == 1) {
//				out++;
//			}
//			if (mines[x+1][y+1] == 1) {
//				out++;
//			}
//			if (mines[x+1][y] == 1) {
//				out++;
//			}
//			if (mines[x][y-1] == 1) {
//				out++;
//			}
//			if (mines[x+1][y-1] == 1) {
//				out++;
//			}
//		}
//		else if(x == l) {
//			if (mines[x][y+1] == 1) {
//				out++;
//			}
//			if (mines[x-1][y+1] == 1) {
//				out++;
//			}
//			if (mines[x-1][y] == 1) {
//				out++;
//			}
//			if (mines[x][y-1] == 1) {
//				out++;
//			}
//			if (mines[x-1][y-1] == 1) {
//				out++;
//			}
//		}
//		else if(y == 0) {
//			if (mines[x-1][y] == 1) {
//				out++;
//			}
//			if (mines[x-1][y+1] == 1) {
//				out++;
//			}
//			if (mines[x][y+1] == 1) {
//				out++;
//			}
//			if (mines[x+1][y] == 1) {
//				out++;
//			}
//			if (mines[x+1][y+1] == 1) {
//				out++;
//			}
//		}
//		else if(y == h) {
//			if (mines[x-1][y] == 1) {
//				out++;
//			}
//			if (mines[x-1][y-1] == 1) {
//				out++;
//			}
//			if (mines[x][y-1] == 1) {
//				out++;
//			}
//			if (mines[x+1][y] == 1) {
//				out++;
//			}
//			if (mines[x+1][y-1] == 1) {
//				out++;
//			}
//		}
//		else {
//			if (mines[x-1][y] == 1) {
//				out++;
//			}
//			if (mines[x-1][y-1] == 1) {
//				out++;
//			}
//			if (mines[x][y-1] == 1) {
//				out++;
//			}
//			if (mines[x+1][y] == 1) {
//				out++;
//			}
//			if (mines[x+1][y-1] == 1) {
//				out++;
//			}
//			if (mines[x-1][y+1] == 1) {
//				out++;
//			}
//			if (mines[x][y+1] == 1) {
//				out++;
//			}
//			if (mines[x+1][y+1] == 1) {
//				out++;
//			}
//		}
//		System.out.println(x + ", " + y);
//		return out;
//	}
//}
