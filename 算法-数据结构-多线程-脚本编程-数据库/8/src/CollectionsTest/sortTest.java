package CollectionsTest;


import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;


public class sortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList nums=new ArrayList();
		nums.add(2);
		nums.add(-5);
		nums.add(3);
		nums.add(0);
		System.out.println(nums);
		Collections.shuffle(nums);
		System.out.println(nums);
		Collections.reverse(nums);
		System.out.println(nums);
		Collections.sort(nums);
		
	}

}
