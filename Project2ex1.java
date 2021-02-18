package smg_3;

public class Project2ex1 {
	
	public static boolean odd (int a) {
		if (a == 1) {
			return true; 
		}
		if (a == 0) {
			return false;
		}
		return odd(a-2);	
	}
	
	public static boolean even (int a) {
		return !odd(a);
	}
	public static void main(String[] args) {
		
	}

}
