package smg_3;

import java.util.Scanner;

public class Project1ex4 {
	
	static public int stepen(int a, int b) {
		int c = a;
		while(b>1) {
			a = a*c;
			b--;
		}
		return a;
	}
	static public int stepenRekurs(int a, int b) {
		if (b == 0) {
			return 1;
		}else {
			return a*stepenRekurs(a, b-1);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number?");
		int num1 = sc.nextInt();
		System.out.println("Number2?");
		int num2 = sc.nextInt();
		System.out.println(stepen(num1,num2));
		System.out.println(stepenRekurs(num1,num2));
	}
}

