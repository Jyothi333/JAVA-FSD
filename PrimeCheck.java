package name;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number:");
		
		int n = sc.nextInt();
		int flag = 0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				flag=flag+1;
		}
		if(flag==0)
			System.out.println("Optimus Prime");
		else
			System.out.println("Not Optimus Prime");
		
		sc.close();
	}

}