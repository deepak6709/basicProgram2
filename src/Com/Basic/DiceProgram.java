package Com.Basic;

import java.util.Random;

public class DiceProgram {

	public static void main(String[] args) {
		Random ran=new Random();
		
		int dice=ran.nextInt(6)+1;// 0 to 1
		
		if(dice==1) {
			
			System.out.println("one");
			
		}
		else if(dice==2) {
			
			System.out.println("two");
			
		}
		else if(dice==3) {
			
			
			System.out.println("Three");
			
		}
		else if(dice==4) {
			
			
			System.out.println("Four");
		}
		else if(dice==5) {
			
			System.out.println("five");
		}
		else {
			
			System.out.println("six");
			
		}


	}

}
