package test3;

import java.util.EnumMap;

enum Season
{
	spring,sunner,fall,winter
}
public class EnumMapTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumMap em=new EnumMap(Season.class);
		em.put(Season.fall,"Çï·çÏôÉª");
		em.put(Season.spring,"´ºÅ¯»¨¿ª");
		
		System.out.println(em);
	}

}
