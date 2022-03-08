package name;

//code about creating and adding elements to a list

import java.util.*;
//import java.util

public class Week2mon {

	public static void main(String[] args) {
		// Antha branthi a na, jeevithana velugu inthe naaa
		 
		List arey = new ArrayList();  // declaration
	       
	        arey.add("Robo");
	        arey.add("Speed");
	        arey.add(1);
	        arey.add("Heart");
	        arey.add("Sana");
	        arey.add(true );
	        arey.add(".");
//	    //    arey.remove("sana"); //remove a specific element
	        arey.get(2);
	        System.out.println(arey.get(1));// op value at that index
	        System.out.println(arey.contains("Speed"));//returns true of false checking if the element is present or not
//	        arey.clear(); //to clear all elements
	        System.out.println(arey);

	}

}