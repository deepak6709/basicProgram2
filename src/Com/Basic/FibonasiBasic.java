package Com.Basic;

public class FibonasiBasic {
	
	public static void fibonasi(int range) {
		
		int f1=1;
		int f2=1;
		System.out.println(f1+" "+f2);
	
		for(int i=2 ;i<=range;i++) {
			int f3=f1+f2;
		System.out.println(f3);
		f1=f2;
		f2=f3;
	
		}
		
	}
	public static void main(String [] args) {
		
		 fibonasi(5);
		
	}
	

}

