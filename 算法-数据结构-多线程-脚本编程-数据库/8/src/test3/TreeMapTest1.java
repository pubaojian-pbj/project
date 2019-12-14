package test3;

import java.util.TreeMap;

class R implements Comparable
{
	int count;
	public String toString()
	{
		return count+"";
	}
	public R(int count)
	{
		this.count=count;
	}
	public boolean equals(Object obj)
	{
		if(this==obj)
			return true;
		if(obj!=null&&obj.getClass()==R.class)
		{
			R r=(R)obj;
			return r.count==this.count;
		}
		return false;
	}
	public int compareTo(Object obj)
	{
		R r=(R)obj;
		return count>r.count?1:count<r.count?-1:0;
	}
}
public class TreeMapTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap tm=new TreeMap();
		tm.put(new R(3),"111");
		tm.put(new R(-5), "2222");
		//tm.put(null, null);
		System.out.println(tm);
	}

}
