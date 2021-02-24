package lec2;

public class pattern2 {

	public static void main(String[] args) {
		int n=3;
		int nst=n;
		
		int row=1;
		while(row<=n) {
			for(int col=0;col<=nst;col++) {
				System.out.print("*");
			}
			System.out.println();
			row=row+1;
			nst=nst-1;
		}

	}

}
