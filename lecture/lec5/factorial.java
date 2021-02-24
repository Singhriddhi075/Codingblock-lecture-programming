package lec5;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(factorial(4));
	}
	public static int factorial(int n) {
		if(n==1) {
			return 1;
		}
		int fnm1=factorial(n-1);
		int fn=fnm1*n;
		return fn;
	}

}
