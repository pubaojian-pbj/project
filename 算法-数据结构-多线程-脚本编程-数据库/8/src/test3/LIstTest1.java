package test3;

import java.util.ArrayList;
import java.util.List;

public class LIstTest1 {

	public static void test(List<?> c)
	{
		for(int i=0;i<c.size();i++)
		{
			System.out.println(c.get(i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1=new ArrayList<>();
		l1.add("1");
		l1.add("2");
		l1.add("-9");
		List<Double> l2=new ArrayList<>();
		l2.add(1.2);
		test(l1);
		test(l2);
	}

}
