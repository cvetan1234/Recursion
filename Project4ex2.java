package smg_3;


public class Project4ex2 {

	public static void main(String[] args) {
	   	 System.out.println("Sum is " + xMethod(8,0));
	}

	public static int xMethod(int n, int sum) {
	   	 if (n == 0)
	   		 return sum;
	   	 else
	   		 return xMethod(n - 1, sum + n);
	}


}