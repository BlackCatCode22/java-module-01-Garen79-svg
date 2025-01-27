package simpleinterest;

import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		System.out.print("Enter the principal amount:");
		double principal = scanner.nextDouble();
		System.out.print("Enter the rate of interest(in %):");
		double rate = scanner.nextDouble();
		System.out.print("Enter the time (in years):");
		double time = scanner.nextDouble();
		double simpleInterest = (principal * rate * time) / 100;
		
		System.out.println("Simple Interest:" + simpleInterest);
	}

}
