package lec2;

import java.util.Scanner;

public class datatype {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int min=scn.nextInt();
		int max=scn.nextInt();
		int step=scn.nextInt();
		for(int f= min;f<=max;f=f+step) {
			int c=(int)((5.0/9)*(f-32));
			System.out.println(c+"\t"+f);
		}
		
		

	}

}
