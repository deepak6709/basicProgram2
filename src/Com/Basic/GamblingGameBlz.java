package Com.Basic;

import java.util.Random;

public class GamblingGameBlz {

	public static void main(String[] args) {
		int money=100;
		Random r=new Random(); // play 100 bet=1 // bet=0 99
		                       // play till money =200 or tilll 0
		   int wincount=0;
		   int losscount=0;
		   
		   int totalplaycount=0;
		
		while(money!=200 && money!=0) {
			
			System.out.println("intial money"+money);
			
			int bet=r.nextInt(2);
			
			if(bet==1) {
				 wincount++;
				money++;
				System.out.println("The Money="+money);
				
			}
			else {
				losscount++;
				money--;
				
				System.out.println("The money is:"+money);
			}
			
			totalplaycount++;
			System.out.println("Remining money :"+money);
			System.out.println("woncount :"+wincount);
			System.out.println("losscount :"+losscount);
			System.out.println("totalplaycount :"+totalplaycount);
			
			
			
		}
		
	}

}
