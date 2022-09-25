package Com.Basic;

import java.util.Scanner;

public class SwappingNumBlz {

	public static void main(String[] args) {

		swap();
	}

	static void swap() {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Number1");
		int x = s.nextInt();

		System.out.println("Enter The Number2");
		int y = s.nextInt();

		System.out.println("Enter The Temparary");

		// int temp=s.nextInt();
		// System.out.println("original number is "+x+""+y);

		int temp = x;
		x = y;
		y= temp;

		System.out.println("The Swapping Of number is" + x + "" + y);

	}

}
