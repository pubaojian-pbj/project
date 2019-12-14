
package 面试算法题;

import java.util.HashSet;
import java.util.Scanner;

public class No_repeat_maxString {

	public static int check(String s) {
		int[] count = new int[s.length()];
		HashSet<Character> set =new HashSet();
		int ans=0;
		for(int i=1;i<s.length()-1;i++) {
//			if(s.charAt(i)!=' ')
				set.add(s.charAt(i));
			for(int j=i+1;j<=s.length()-2;j++) {
				if(set.contains(s.charAt(j)))
					break;
				else {
//					if(s.charAt(i)!=' ')
						set.add(s.charAt(j));
				}
			}
			count[i]=set.size();
			set.clear();
		}
		int max=0;
		for(int i=0;i<count.length;i++) {
			if(max<count[i])
				max=count[i];
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s =sc.nextLine();
		int length = check(s);
		System.out.println(length);
	}

}
