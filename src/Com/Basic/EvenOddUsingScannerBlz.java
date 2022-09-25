package Com.Basic;

import java.util.Scanner;

public class EvenOddUsingScannerBlz {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Number=");
		
		int num=s.nextInt();
		
		if(num%2==0) {
		
		System.err.println("The Number Is Even");
		}
		else {
			
			System.err.println("The Number Is Odd");
			
		}
	}

}
