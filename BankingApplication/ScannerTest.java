package BankingApplication;

import java.util.Scanner;

public class ScannerTest {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int in = scan.nextInt();
		System.out.println("Enter a number: ");
		char c = scan.next().charAt(0);
		System.out.println("value = " + c);
		
		
		
		
	}

}
