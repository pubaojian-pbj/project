package test3;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque ad2=new ArrayDeque();
		ad2.offerFirst(1);
		ad2.offerFirst(2);
		ad2.offerFirst(3);
		ad2.offerFirst(-89);
		ad2.offer(-9);
		ad2.offerLast(-7);
		System.out.println(ad2);
		System.out.println(ad2.getFirst());
		System.out.println(ad2.peekFirst());
		System.out.println(ad2.pollFirst());
		System.out.println(ad2.removeFirst());
		System.out.println(ad2);
		System.out.println(ad2.poll());
		System.out.println(ad2.remove());
		Iterator i=ad2.descendingIterator();
		while(i.hasNext())
		{
			int a=(int)i.next();
			System.out.println(a);
		}
	}

}
