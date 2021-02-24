package lec2;

public class pattern10 {

	public static void main(String[] args) {
	    int n=4;
	    int row=1;
	    int nst=1;
	    int nsp=2*n-3;
	    while(row<=n) {
	    	for(int cst=1;cst<=nst;cst++) {
	    		System.out.print("*");
	    	}
	    	for(int csp=1;csp<=nsp;csp++) {
	    		System.out.print("");
	    	}
	    	int cst=1;
	    	{
	    	for(;cst<=nst;cst++) {
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    	if(row<=n/2) {
	    		nst=nst+1;
	    		nsp=nsp-2;
	    		row++;
	    	}
	    		
	    }

	}

}
