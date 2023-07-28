// https://dmoj.ca/problem/bsspc21s1

import java.util.Scanner;

public class lashky {
	public static boolean palindromeMaker(String a) {
		String reversed = "";
		boolean hasEmpty = false;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == '.') {
				hasEmpty = true;
			}
		}
		String halfOne = "";
		String halfTwo = "";
		if (hasEmpty == true) {
			if (a.length()%2 == 0) {
				for (int i = 0; i < a.length()/2; i++) {
					halfOne += a.charAt(i);
				}
				for (int i = a.length()/2; i < a.length(); i++) {
					halfTwo += a.charAt(i);
				}
				for (int i = 0; i < a.length()/2; i++) {
					
				}
			} else {
				
			}
			
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		String[] grid = new String[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				grid[i] += scan.next();
			}
		}
		boolean palindrome = true;
		for (int i = 0; i < n; i++) {
			if (palindromeMaker(grid[i]) == true) {
				palindrome = false;
				System.out.println(-1);
				break;
			} 
		}
		if (palindrome == true) {
			System.out.println("");
		}
	}
}
