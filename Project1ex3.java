  
package smg_3;

import java.util.Scanner;

public class Project1ex3 {
	static public int stepen2(int a) {
		int result = 1;
		while(a>0) {
			result = result*2;
			a--;
		}
		return result;
	}
	static public int stepen2rekurs(int a) {
		if (a == 0) {
			return 1;
		}else {
			
			return 2*stepen2rekurs(a-1);
		}
	}
	public static void main(String[] args) {
		System.out.println("Number?");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(stepen2(num));
		System.out.println(stepen2rekurs(num));
	}
}