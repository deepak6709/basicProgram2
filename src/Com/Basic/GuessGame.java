package Com.Basic;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {
		 Random r=new Random();
		 
		 Scanner s=new Scanner(System.in);
		 
		 int guessNum=3;
		 
		 int rannum=5;
		 
		 int guessCount=0;
		 
		 while(guessNum!=rannum) {
			 
			guessCount++;
			 
			 rannum=r.nextInt(10)+1;
			 
			 System.out.println("Enter the guess number between the 1 to 10");
			 
			 guessNum=s.nextInt();
			 
			 System.out.println("guess number:"+guessNum);
			 System.out.println("random  number:"+rannum);
			 
			 System.out.println("guess count is :"+guessCount);
			 
		 }

	}

}
