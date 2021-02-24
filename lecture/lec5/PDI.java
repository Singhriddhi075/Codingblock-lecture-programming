package lec5;

public class PDI {

	public static void main(String[] args) {
		PDI(4);

	}
    public static void PDI(int n) {
   	
   	if(n==0) {
		return;
	}
   	System.out.println(n);
    	PDI(n-1);
    	
    	
    	
    	System.out.println(n);
    }
}
