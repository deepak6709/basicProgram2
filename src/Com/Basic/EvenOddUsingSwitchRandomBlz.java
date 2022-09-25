package Com.Basic;

import java.util.Random;

public class EvenOddUsingSwitchRandomBlz {

	public static void main(String[] args) {
	   Random r=new Random();
	   
	   int num=r.nextInt(2);
	   
	   switch(num) {
	   
	   case 0 :
		         if(num%2==0) {
		        	 
		        	 System.out.println("The Number is Even");
		        	 
		         }
		         break;
		         
	   case 1:
		   
		   System.out.println("The Number is odd");
	   
	   
	   }
	}

}
