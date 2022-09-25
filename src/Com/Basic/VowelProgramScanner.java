package Com.Basic;

import java.util.Scanner;

public class VowelProgramScanner {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the alphabet");
		
            int ch=s.next().charAt(0);
		
		if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'|| ch=='u') {
			
			System.out.println("It is vowel");
			
		}
		else {
			
			System.out.println("It is constant");
			
		}
	}

}
