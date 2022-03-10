package name;

import java.util.TreeSet;

public class Treeset2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts= new TreeSet();
		ts.add(0001);
		ts.add(0010);
		ts.add(0011);
		ts.add(0100);
		ts.add(0101);
		System.out.println(ts.headSet(0011));
		System.out.println(ts);
		System.out.println(ts.tailSet(0011));
		System.out.println(ts.subSet(0010,0101));
		System.out.println(ts.size());
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.higher(0011));
		System.out.println(ts.lower(0100));

	}

}
