package lec5;

public class arraylist {

	public static void main(String[] args) {
		PD(5);

	}
    public static void PD(int n) {
//    	base case
    	if(n==0) {
    		return;
    	}
//    	self work
    	System.out.println(n);
//    	smaller problem
    	PD(n-1);
    }
}
