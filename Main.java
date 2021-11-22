import java.util.Scanner;

public class Main {
	
	public static void print_square(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(i == 1 || i == n || j == 1 || j == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void print_diamond(int n) {
		int i, j, k;
		
		for (i = 1 ; i <= n; i++) {
			for (j = 1 ; j <= n - i; j++) {
				System.out.print(" ");	
			}
			for (k = 1 ; k <= i * 2 - 1; k++) {
				if (k == 1 || k == i * 2 - 1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for (i = n - 1 ; i > 0; i--) 
		{
			for (j = 1 ; j <= n - i; j++) 
			{
				System.out.print(" ");
			}
			for (k = 1 ; k <= i * 2 - 1; k++) 
			{
				if (k == 1 || k == i * 2 - 1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in).useDelimiter("\n");
		int n = in.nextInt();
		String[][] matrix = new String[n][n];
		
		if(n >= 2 && n <= 26) {
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					matrix[i][j] = in.next();
				}
			}
		} else System.out.println("Please enter a number from 2 to 26");
		
		in.close();
		
//		for(int i = 0; i <n; i++) {
//			for(int j = 0; j < n; j++) {
//				System.out.print(matrix[i][j]);
//			}
//			System.out.println();
//		}

		if(matrix[0][0].equals("a") ) {
			print_square(n);
		}
		
		if(matrix[n/2][n/2].equals("a")) {
			print_diamond(n);
		}
	}
}
