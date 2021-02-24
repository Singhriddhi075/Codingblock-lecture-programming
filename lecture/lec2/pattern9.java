package lec2;

public class pattern9 {

	public static void main(String[] args) {
		int n=5;
		int row=1;
		int nst=n/2;
		int nsp=1;
		while(row<=n) {
			for(int cst=1;cst<=nst;cst++) {
				System.out.print("*");
				
			}
			for(int cst=1;cst<=nst;cst+=2) {
				System.out.print("*");
			}
			System.out.println();
			if(row<=n/2) {
				nst=nst-1;
				nsp=nsp+2;
			}else {
				nst=nst+1;
			    nsp=nsp-2;
			}
			row++;
			
		}

	}

}
