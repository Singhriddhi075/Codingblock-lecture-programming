package lec2;

import java.util.Scanner;

public class inverse {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int pos=1;
		int sum=0;
		while(n>0) {
			int rem=n%10;
			int temp=pos*(int)Math.pow(10,rem-1 );
			sum=sum+temp;
		    
			n=n/10;
			pos++;
		}
		System.out.println(sum);

	}

}
