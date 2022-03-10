package name;

//import java.util.*;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {

	public static void main(String[] args) {
		// Slava Ukraini!
		Collection c= new ArrayList();
		c.add("If");
		c.add(" You can");
		c.add(" Dream");
		c.add(" But not");
		c.add(" make dreams");
		c.add(" your Master");
		System.out.println(c.isEmpty());
		Iterator itr = c.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next());
		}
		
	}

}