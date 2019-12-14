package test3;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
		ll.offer(1);
		ll.offer(3);
		ll.add(9);
		System.out.println(ll);
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
		System.out.println(ll.peek());
		System.out.println(ll.poll());
		System.out.println(ll);
		System.out.println(ll.indexOf(9));
		ll.add(2, -9);
		System.out.println(ll);
		ll.forEach(System.out::println);
	}

}
