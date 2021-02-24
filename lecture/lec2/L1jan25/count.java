package L1jan25;

import java.util.Scanner;

public class count {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int frequencydigit==(int n,int d);
		int count=0;
		while(n>0) {
			if(n%10==d)
				count=count+1;
			n=n/10;
			
		}
		System.out.println(count);

	}

}
