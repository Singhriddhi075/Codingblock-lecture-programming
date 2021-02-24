package lec2;

public class pattern7 {

	public static void main(String[] args) {
		int n=5;
		int nst=1;
		int nsp=n-1;
		int row=1;
		while(row<=2 * n - 1) {
			//space ka loop
			for(int cst=1;cst<=nst;cst++) {
				System.out.print("*");
				
			}
			
			System.out.println();
			if(row<=n-1) {
				nsp=nsp-1;
				nst=nst+1;
			}else {
				nsp=nsp+1;
				nst=nst-1;
			}
			row=row+1;
		}
	    

	}

}
