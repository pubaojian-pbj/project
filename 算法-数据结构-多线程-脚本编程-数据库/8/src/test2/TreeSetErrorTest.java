package test2;

import java.util.List;
import java.util.TreeSet;


class error implements Comparable
{
	int a;
	public error(int a)
	{
		this.a=a;
	}
	public error()
	{
	}
	public int compareTo(Object obj)
	{
		return 1;
	}
	/*public String toString()
	{
		return a+"";
	}*/
	public boolean equals(Object obj)
	{
		
		
		return true;
	}
}
public class TreeSetErrorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<E> booklist=new ArrayList();
		//booklist.iterator();
		TreeSet h=new TreeSet();
		error z1=new error(6);
		h.add(z1);
		System.out.println(h.add(z1));
		System.out.println(h);
		//h.add(new String("pubaojain"));
		((error)(h.first())).a=9;
		System.out.println(h);
	}

}
