package L1jan25;
import java.util.*;
public class doubts {
    public static void main(String args[]) {
       Scanner scn=new Scanner(System.in);
       int n=scn.nextInt();
       int[] array=new int[n];
       for(int i=0;i<n;i++)
       {
    	   System.out.println(array[i]);
       }
       for(int i=n-1;i>=0;i--){           // Corrected indexing and i updation
          System.out.println(array[i]+" ");         // endl added
       }
    }
}
