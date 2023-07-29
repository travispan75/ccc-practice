import java.util.Scanner;
import java.lang.Math;

public class S2 {
	public static int crop(int[] array, int cropVal) {
		int total = 0;
		int minimum = 0;
		int first = 0;
		for (int j = 0; j < array.length - cropVal; j++) {
			for (int i = 0; i < (cropVal + 1)/2; i++) {
				total += Math.abs(array[j + i] - array[j + cropVal - i]);
			}
			if (total < minimum || first == 0) {
				minimum = total;
				first = 1;
			}
			total = 0;
		}
		return minimum;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] mountains = new int[n];
		for (int i = 0; i < n; i++) {
			mountains[i] = scan.nextInt();
		}
		for (int i = 0; i < mountains.length; i++) {
			System.out.print(crop(mountains, i));
			System.out.print(" ");
		}
	}
}
