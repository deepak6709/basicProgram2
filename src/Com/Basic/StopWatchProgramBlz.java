package Com.Basic;

import java.util.Scanner;

public class StopWatchProgramBlz {

	public static void main(String[] args) {

		long startTime = 0;
		long endTime = 0;
		long elapsedTime = 0;

		Scanner scanner = new Scanner(System.in);

		// Enter 1 to start time

		System.out.println("Enter The Start Time 1");

		int input1 = scanner.nextInt();

		if (input1 == 1)

			startTime = System.currentTimeMillis();

		System.out.println(startTime);

		System.out.println("Enter the 0 to end time");

		int input2 = scanner.nextInt();

		if (input2 == 0)

			// Enter 0 to End Time

			System.out.println("Enter the 0 to end time");

		endTime = System.currentTimeMillis();

		System.out.println(endTime);

		System.out.println("Elapsed Time Between Star and End Time");

		elapsedTime = (endTime - startTime)/1000;

		System.out.println(elapsedTime+" "+"second");

	}

}
