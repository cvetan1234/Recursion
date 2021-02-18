package smg_3;

import java.util.Scanner;

public class Project2ex3 {
	public static int num = 0;
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of disks: ");
		int n = input.nextInt();
		// Find the solution recursively
		moveDisks(n, 'A', 'B', 'C');
		System.out.println("The number moves is: " + num);
		
	}

	/**
	 * The method for finding the solution to move n disks from fromTower to toTower
	 * with auxTower
	 */
	public static void moveDisks(int n, char fromTower, char toTower, char auxTower) {
		int turns = 0;
		if (n == 1) { // Stopping condition
			System.out.println("Move disk " + n + " from "+ fromTower + " to " + toTower);
		num++;
		}else {
			turns++;
			moveDisks(n - 1, fromTower, auxTower, toTower);
			System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
			moveDisks(n - 1, auxTower, toTower, fromTower);
			num++;
		}
	}
}
