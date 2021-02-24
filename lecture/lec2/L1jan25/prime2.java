package L1jan25;

import java.util.Scanner;

public class prime2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int div = 2;
		while(div<=n-1) {
			if(n%div==0) {
				System.out.println("prime");
			}
			else {
				System.out.println("not prime");
			}
			div=div+1;
		}

	}

}
