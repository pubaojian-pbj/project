package 面试算法题;

import java.util.Scanner;

public class Leetcode_zigzag_conversion {
	public static String convert(String s,int rows) {
		if(s==null || s.equals("")) {
			return s;
		}
		int x=0;
		if(rows==1) {
			x=s.length();
		}
		else {
			x=((s.length())/(2*rows-2))*2+1;
		}
		int count1=1,k=0;
		char[][] arrays = new char[rows][x];
		s=s.substring(1,s.length()-1);
		for(int i=0;i<x;i++) {
			for(int j=0;j<rows;j++) {
				if(count1==1) {
					if(s.length()<=k) {
						arrays[j][i]='#';
					}
					else {
						arrays[j][i]=s.charAt(k);
						k++;
					}
			
				}
				else {
					if(count1%2==0) {
						if(rows>1) {
							if(j==0 || j==rows-1) {
								arrays[j][i]='#';
							}
							else {
								if(s.length()<=k) {
									arrays[rows-j-1][i]='#';
								}
								else {
									arrays[rows-j-1][i]=s.charAt(k);
									k++;
								}
							}
						}
						else {
							if(s.length()<=k) {
								arrays[j][i]='#';
							}
							else {
								arrays[j][i]=s.charAt(k);
								k++;
							}
						}
						
					}
					else {
						if(s.length()<=k) {
							arrays[j][i]='#';
						}
						else {
							arrays[j][i]=s.charAt(k);
							k++;
						}
					}
				}
			}
			count1++;
		}
//		for(int i=0;i<rows;i++) {
//			for(int j=0;j<x;j++) {
//				System.out.print(arrays[i][j]+" ");
//			}
//			System.out.println("");
//		}
		StringBuilder string  = new StringBuilder();
		string.append('"');
		for(int i=0;i<rows;i++) {
			for(int j=0;j<x;j++) {
				if(arrays[i][j]=='#') {
					continue;
				}
				else {
					string.append(arrays[i][j]);
				}
			}
		}
		string.append('"');
		return string.toString();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int numRows = sc.nextInt();
		String snew = convert(s,numRows);
		System.out.println(snew);
	}

}
