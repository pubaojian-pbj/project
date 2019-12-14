package test3;

import java.util.ArrayDeque;

public class ArrayDequeTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque ad=new ArrayDeque();
		ad.push(1);
		ad.push(2);
		ad.push(3);
		ad.push(-9);
		System.out.println(ad);
		System.out.println(ad.peekFirst());
		System.out.println(ad.getFirst());
		System.out.println(ad.peek());
		System.out.println(ad.pop());
		System.out.println(ad);
	}

}
