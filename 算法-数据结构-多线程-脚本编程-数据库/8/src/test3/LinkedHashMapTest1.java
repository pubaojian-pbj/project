package test3;

import java.util.LinkedHashMap;

public class LinkedHashMapTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap lhm=new LinkedHashMap();
		lhm.put("����", 109);
		lhm.put("��ѧ",119);
		lhm.put("����",219);
		lhm.put("Ӣ��",79);
		//lhm.forEach((key,value)->System.out.println(key+"-->"+value));
		lhm.putAll(lhm);
		lhm.forEach((key,value)->System.out.println(key+"-->"+value));
		
	}

}
