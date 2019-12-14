/**
 * 
 */
package test1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Stream;

/**
 * @author pubaojian 2019年4月20日
 *
 */
class R{
	int count;
	public R(int count) {
		this.count=count;
	}
	public int hashCode() {
		return this.count;
	}
	@Override
	public String toString() {
		return "R [count=" + count + "]";
	}
	
}
public class IteratorTest {
	static int temp;
	public static void main(String[] args) throws InterruptedException {
		List list = new ArrayList<>();
		int[] a= {0};
		for(int i=0;i<10;i++) {
			list.add(i,new Random().nextInt(20));
		}
		Scanner sc = new Scanner(System.in);
		for(int i=10;i<12;i++) {
			a[i]=sc.nextInt();
		}
		list.add(1);
		System.out.println(list.toString());
		list.remove(2);
		System.out.println(list.toString());
		Iterator it = list.iterator();
		while(it.hasNext()) {
//			if((temp = (int) it.next()) % 2==0) {
//				//list.remove(temp); //Exception in thread "main" java.util.ConcurrentModificationException
//				it.remove();
//			}
			
		}
//		
		LinkedList ll = new LinkedList();
		ArrayDeque ad = new ArrayDeque();
		LinkedHashMap l = new LinkedHashMap();
		Properties p = new Properties();
		TreeMap t = new TreeMap();
//		EnumMap e= new EnumMap();
		HashMap<String,Integer> map = new HashMap();
		map.put("蒲宝剑1",70);
		map.put("蒲宝剑2",50);
		map.put("蒲宝剑3",30);
		map.put("蒲宝剑4",90);
		map.put("蒲宝剑5",60);
		System.out.println(map.values());

		map.entrySet().stream().filter((ele1)->checkValue(ele1)).forEach(ele1->System.out.println(ele1.getKey()));
		System.out.println();
		 HashSet hs = new HashSet();
//		 hs.add("a"); 
		 hs.add(1);
		 hs.add(2);
//		 hs.add("a"); 
//		 hs.add("b");
//		 hs.add("c"); 
//		 hs.add("d"); 
//		 hs.add(new R(-2));
//		 hs.add(new R(-4));
//		 hs.parallelStream().forEach(x -> System.out.println(x)); 
//		 Thread.sleep(1000); 
//		 System.out.println(hs);
//		 System.out.println(hs.contains(new R(-2)));
//		 Iterator it = hs.iterator();
//		 R first = (R) it.next();
//		 first.count=-4;	
//		System.out.println(hs);
//		System.out.println(hs.contains(new R(-4)));
//		System.out.println(hs);
//		System.out.println(hs.contains(2));
//		Iterator it =hs.iterator();
//		System.out.println(hs.remove(2));
//		LinkedHashSet lhs = new LinkedHashSet();
//		TreeSet ts = new TreeSet((o1,o2)->{
//			R r1 = (R)o1;
//			R r2 = (R)o2;
//			return r1.count>r2.count?-1:r1.count<r2.count?1:0;
//			
//		});
	}
	/**
	 * @param value
	 * @return
	 */
	/**
	 * @param ele1
	 */
	private static boolean checkValue(Entry<String, Integer> ele1) {
		// TODO Auto-generated method stub
		if(ele1.getValue()>=60) {
			return true;
		}
		return false;
	}
	
}
