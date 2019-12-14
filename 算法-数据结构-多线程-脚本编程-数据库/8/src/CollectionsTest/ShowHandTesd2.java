package CollectionsTest;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ShowHandTesd2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection l=new ArrayList();
		l.add("pubaojain");
		l.add("xubo");
		l.add(5);
		l.forEach(System.out::println);
		l.forEach(ele->System.out.println(ele));
		/*for(Object obj:l)
		{
			System.err.println(obj);
		}*/
		System.out.println(l);
		
	}

}
