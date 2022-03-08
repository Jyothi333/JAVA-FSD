package name;
import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
	
//      int number1 = 10;
//      int number2 = 20;
//      System.out.println(number1+number2);
//     int number;
      
      Scanner s = new Scanner(System.in);//bcoz input for system
      System.out.println("Entered number is :" );
      
      int number = s.nextInt();//bcoz input is int
//      String name = s.next();
//      System.out.println("received string is " + name.length());
     System.out.println("received number is:"+ number);    
      
      s.close();

	}

}