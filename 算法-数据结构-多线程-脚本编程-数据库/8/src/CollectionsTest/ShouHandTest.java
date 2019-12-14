package CollectionsTest;

import java.util.ArrayList;
import java.util.Collections;

public class ShouHandTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		ArrayList al2=new ArrayList();
		al.add(2);
		al.add(9);
		al.add(-5);
		al.add(0);
		al2.addAll(al);
		//al2.add();
		System.out.println(al);
		System.out.println(Collections.max(al));
		System.out.println(Collections.min(al));
		//Collections.fill(al,9);
		//System.out.println(Collections.replaceAll(al, 0, 1));
		Collections.sort(al);
		System.out.println(al);
		System.out.println(Collections.binarySearch(al, -5));
		System.out.println(Collections.frequency(al,2));
		
		System.out.println(Collections.indexOfSubList(al, al2));
	}

}
