package Com.Basic;

import java.util.Scanner;

public class EvenForSacnnerBlz {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		
		System.out.println("Enter The Number");
		
		int num=s.nextInt();
		while(num<20) {
			num++;
          for(int i=num;i<=num ;i++) {
			
			if(num%2==0) {
				
				System.out.println("The Number Is Even =" +num);
				
			}
			else {
				
				System.err.println("The Number Is Odd = " +num);
			}
			//num++;
          }
		}
	}



}


