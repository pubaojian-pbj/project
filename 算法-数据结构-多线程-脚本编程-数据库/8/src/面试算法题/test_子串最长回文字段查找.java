package 面试算法题;

import java.util.Scanner;


public class test_子串最长回文字段查找 {
	public static String test(String s) {
		int k=0;
		StringBuilder substring1 = null;
		StringBuilder substring2 = null;
		StringBuilder[] ss = new StringBuilder[s.length()];
		for(int i=0;i<s.length();i++) {
			substring1=new StringBuilder();
			substring2=new StringBuilder();
			substring1.append(s.charAt(i));
			for(int j=i+1;j<s.length();j++) {
				substring1.append(s.charAt(j));
				StringBuilder string  =new StringBuilder();
				string.append(substring1.toString());
				if(substring1.toString().equals(string.reverse().toString())) {
					substring2.delete(0, substring2.length());
					substring2.append(substring1.toString());
				}
			}
			ss[k++]=substring2;
			substring1=null;
			substring2=null;
		}
		int max = ss[0].length();
		int flag=0;
		for(int i=1;i<k;i++) {
			if(ss[i].length()>max) {
				max=ss[i].length();
				flag =i;
			}
		}
		String sub =null;
		if(max==0) {
			if(s!=null) {
				sub = s.charAt(0)+"";
			}
		}
		else {
			sub = ss[flag].toString();
		}
		return sub;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String ss = test(s);
		System.out.println(ss);
	}

}
