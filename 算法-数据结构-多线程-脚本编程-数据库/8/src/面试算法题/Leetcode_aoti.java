package 面试算法题;

import java.util.Scanner;

public class Leetcode_aoti {
	public static int myAtoi(String str) {
		if(str==null || str.isEmpty()) {
			return 0;
		}
		if(Character.isAlphabetic(str.charAt(0))) {
			return 0;
		}
		StringBuilder s = new StringBuilder();
		String ss = str.trim();
		int flag=1;
		for(int i=0;i<ss.length();i++) {
			char a = ss.charAt(i);
			if(a=='-' && i==0) {
				s.append(a);
			}
			if((ss.charAt(i)=='0' || ss.charAt(i)=='-') && flag==1) {
				continue;
			}
			flag=0;
			if(Character.isDigit(a)) {
				s.append(a);
			}
			if(ss.charAt(i)=='.') {
				break;
			}
			
		}
		String sss = s.toString();
		System.out.println(sss);
		if(sss.isEmpty() || (sss.length()==1&& sss.charAt(0)=='-')) {
			return 0;
		}
		int min  =Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		String minString = String.valueOf(min);
		String maxString = String.valueOf(max);
		System.out.println(sss.compareTo(minString));
		if(sss.length()<minString.length()) {
			for(int i=sss.length();i<minString.length();i++) {
				s.append('0');
			}
		}
		String stringss = s.toString();
		System.out.println(stringss);
		if(sss.equals("-1")) {
			sss="-1";
		}
		else if(sss.charAt(0)=='-' && (stringss.compareTo(minString)>=0 || sss.length()>=minString.length())) {
			sss = minString;
		}
		else if(sss.charAt(0)!='-' && stringss.compareTo(minString)>=0 && sss.length()>=minString.length()) {
			sss = maxString;
		}
	    return Long.valueOf(sss).intValue();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(myAtoi(s));
	}

}
