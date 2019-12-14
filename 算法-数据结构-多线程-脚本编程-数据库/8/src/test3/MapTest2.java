package test3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map=new HashMap();
		map.put(1, 22);
		map.put(2, 33);
		map.put(null, 44);
		map.put(3, null);
		System.out.println(map);
		map.replace(3,66);
		System.out.println(map);
		map.merge(1, 10, (oldval,param)->(Integer)oldval+(Integer)param);
		System.out.println(map);
		map.computeIfAbsent(2, ele->((Integer)ele).intValue());
		System.out.println(map);
		map.computeIfPresent(2, (key,value)->(Integer)value*(Integer)value);
		System.out.println(map);
		Collection p=map.values();
		System.out.println(p);
		Set s=map.entrySet();
		System.out.println(s);
	}

}
