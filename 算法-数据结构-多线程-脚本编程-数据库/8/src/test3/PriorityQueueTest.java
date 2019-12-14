package test3;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue pq=new PriorityQueue();
		pq.offer(1);
		pq.offer(-2);
		pq.offer(4);
		pq.offer(-9);
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq.element());
		//System.out.println(pq.remove());
		System.out.println(pq);
		//System.out.println(pq.peek());
	}

}
