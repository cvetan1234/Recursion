package smg_3;

import java.util.Scanner;

public class Project1ex1 {
	public static void main(String[] args) {
		int sum = 0;
		System.out.println("Number?");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		sc.close();
		for (int n = k; n > 1; n--) {
			sum = sum + n;
		}
		System.out.println("Sum is: " + sum);
	}
}
