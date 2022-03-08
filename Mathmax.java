package name;

import java.util.Scanner;
//import math

public class Mathmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number 1:");
		
		int m = sc.nextInt();
		
		System.out.println("Enter Number 2:");
		
		int n = sc.nextInt();
		
		System.out.println(Math.max(m,n));
		
		sc.close();
		
	}

}