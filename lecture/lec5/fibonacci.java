package lec5;

public class fibonacci {

	public static void main(String[] args) {
		
System.out.println(fibonaciee(8));
	}
	public static int fibonaccie(int n) {
		if(n==0||n==1) {
			return n;
		}
		int fnm1=fabonacie(n-1);
		intfnm2=fibonaccie(n-2);
		int fn=fnm1+fnm2;
		return fn;
	}

}
