package 面试算法题;

import java.util.Scanner;

public class Leetcode_无符号整数取反 {
	public static int reverse(String s) {
		StringBuilder string = new StringBuilder();
		StringBuilder string2 = new StringBuilder();
		int i=s.length()-1;
		if(s.charAt(0)=='-') {
			while(s.charAt(i)=='0') {
				i--;
			}
			for(int j=1;j<i+1;j++) {
				string.append(s.charAt(j));
			}
			string2.append('-');
			string2.append(string.reverse());
			String ss = string2.toString();
			return (int)Integer.valueOf(ss);
		}
		else {
			while(s.charAt(i)=='0') {
				i--;
			}
			for(int j=0;j<i+1;j++) {
				string.append(s.charAt(j));
			}
			string2.append(string.reverse());
			String ss = string2.toString();
			return (int)Integer.valueOf(ss);
		}
	}
	public static int reverses(int x) {
		int rev=0;
		while(x!=0) {
			int pop = x%10;
			x/=10;
			if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
			rev = rev*10+pop;
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int p = sc.nextInt();
		System.out.println(reverses(p));
		int a = reverse(s);
		System.out.println(a);
	}

}
