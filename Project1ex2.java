package smg_3;

import java.util.Scanner;

public class Project1ex2 {

	public static void main(String[] args) {
		int num = 0;
		System.out.println("Number?");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		sc.close();
		for(int n = k; n >0; n = n/10) {
			num = n%10;
			System.out.print(num);
		}

	}

}
