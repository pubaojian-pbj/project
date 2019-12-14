package test3;

import java.util.WeakHashMap;

public class WeakHashMapTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeakHashMap whm=new WeakHashMap();
		whm.put(new String("ำ๏ฮฤ"),99);
		whm.put(new String("สýัง"), 129);
		//whm.put("java", 85);
		System.out.println(whm);
		System.gc();
		System.runFinalization();
		System.out.println(whm);
	}
}
