package Com.Basic;

public class LargestTwoNumBlz {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=20;
		int num3=10;
		
		
		if(num1>=num2 && num1>=num3) {
			
			
			System.out.println(num1+ "\nLargest Number1");
		}
		else if(num2>=num1 && num2>=num3 ) {
			
			System.out.println(num2+ "\nLargest Number2");
			
		}
		else {
			
			System.out.println(num3+ "\nLargest Number3");
		}

	}

}
