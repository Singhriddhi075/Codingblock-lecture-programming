package lec5;

public class pidrecursion {

	public static void main(String[] args) {
		

	}
	public static void PID(int n,int present) {
		if(present==n+1) {
			return;
		}
		System.out.println(present);
		PID(n,present+1);
		System.out.println(present);
	}

}
