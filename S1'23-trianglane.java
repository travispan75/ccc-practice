// https://dmoj.ca/problem/ccc23s1

import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int c = scan.nextInt();
		int[] rowOne = new int[c];
		int[] rowTwo = new int[c];
		for (int i = 0; i < rowOne.length; i++) {
			rowOne[i] = scan.nextInt();
		}
		for (int i = 0; i < rowTwo.length; i++) {
			rowTwo[i] = scan.nextInt();
		}
		int tape = 0;
		for (int i = 0; i < rowOne.length; i++) {
			if (rowOne[i] == 1) {
				tape += 3;
				if (i != 0 && i != rowOne.length - 1) {
					if (rowTwo[i] == 1 && i%2 == 0) {
						tape -= 1;
					} 
					if (rowOne[i - 1] == 1) {
						tape -= 1;
					} 
					if (rowOne[i + 1] == 1) {
						tape -= 1;
					}
				} else if (c == 1) {
					if (rowTwo[i] == 1) {
						tape -= 1;
					}
				} else if (i == 0) {
					if (rowTwo[i] == 1 && i%2 == 0) {
						tape -= 1;
					} 
					if (rowOne[i + 1] == 1) {
						tape -= 1;
					}
				} else if (i == rowOne.length - 1) {
					if (rowTwo[i] == 1 && i%2 == 0) {
						tape -= 1;
					} 
					if (rowOne[i - 1] == 1) {
						tape -= 1;
					}
				}
			}
		}
		for (int i = 0; i < rowTwo.length; i++) {
			if (rowTwo[i] == 1) {
				tape += 3;
				if (i != 0 && i != rowTwo.length - 1) {
					if (rowOne[i] == 1 && i%2 == 0) {
						tape -= 1;
					} 
					if (rowTwo[i - 1] == 1) {
						tape -= 1;
					} 
					if (rowTwo[i + 1] == 1) {
						tape -= 1;
					}
				} else if (c == 1) {
					if (rowOne[i] == 1) {
						tape -= 1;
					}
				} else if (i == 0) {
					if (rowOne[i] == 1 && i%2 == 0) {
						tape -= 1;
					} 
					if (rowTwo[i + 1] == 1) {
						tape -= 1;
					}
				} else if (i == rowTwo.length - 1) {
					if (rowOne[i] == 1 && i%2 == 0) {
						tape -= 1;
					} 
					if (rowTwo[i - 1] == 1) {
						tape -= 1;
					}
				}
			}
		}
		System.out.println(tape);
	}
}
