package Com.Basic;

import java.util.Scanner;

public class CountDigitBlz {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Number");
		
		int num=s.nextInt(); // num=142353535
		
		long temp=num;
		int count=0;
		
		while(num!=0) {
			
			num=num/10;
			
			count++;
			
			//System.out.println(temp+" "+count+"count digit is");
			
			
			
			
			
			
		}
		System.out.println(temp+" "+count+" count digit is");
		
		
	}

}
