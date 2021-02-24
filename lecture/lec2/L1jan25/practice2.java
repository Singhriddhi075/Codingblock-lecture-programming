package L1jan25;

import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
		
		Scanner scn =new Scanner (System.in);
		int age=scn.nextInt();
		if(age<=11) {
			System.out.println("child");
		}else if(age>=11 && age<=18){
				System.out.println("teenager");
		}else if(age>=18){
					System.out.println("young");
		}else{ 
			System.out.println("old");
		}
				
			
	}

}


