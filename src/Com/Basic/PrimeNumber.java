package Com.Basic;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		 
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		
		for(int i=1;i<n/2;i++) {
			
			if(n%2==0) {
				
				System.out.println("It is not prime Number");
				
			}
			else {
				
				System.out.println("It is prime");
			}
			
			
		}
	}

}
