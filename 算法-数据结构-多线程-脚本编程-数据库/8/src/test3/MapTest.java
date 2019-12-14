package test3;

import java.util.HashMap;
import java.util.Iterator;

/*class A
{
	int n;
	public A(int n)
	{
		this.n=n;
	}
	public String toString()
	{
		return n+"";
	}
}*/
public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap ht=new HashMap();
		ht.put(6000, "hello");
		ht.put(87563,"word");
		//System.out.println(ht);
		Iterator it=ht.keySet().iterator();
		/*for(Object key:ht.keySet())
		{
			System.out.println(key+"-->"+ht.get(key));
		}*/
		/*A first=(A)it.next();
		first.n=87563;
		System.out.println(ht);
		ht.remove(new A(87563));+
		System.out.println(ht);
		System.out.println(ht.get(new A(87653)));*/
	}

}
