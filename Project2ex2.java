package smg_3;

public class Project2ex2 {
	public static String dec2Bin ( int value ) {
		if (value != 0) {
			return dec2Bin (value/2) + value%2;
		} else {
			return "";
		}
	}
	public static void main(String[] args) {
		System.out.println(dec2Bin(2));
	}

}
