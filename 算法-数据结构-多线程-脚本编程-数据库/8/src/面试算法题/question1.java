/**
 * 
 */
package 面试算法题;

import java.util.HashMap;
import java.util.Scanner;

public class question1 {

	public static int number(int n) {
		int[] age = new int[10000];
		int count = 0;
		for(int i=1;i<=n;i++) {
			if(i==1) {
				count=1;
				age[i]=0;
			}
			if(i>=2) {
				for(int p=1;p<=count;p++) {
					age[p]=age[p]+1;
				}
				for(int j=1;j<=count;j++) {
					if(age[j]>10){
						count--;
					}
					if(age[j]>=2 && age[j]<7) {
						count++;
						age[count]=0;
					}
				}
			}
		}
		for(int i=1;i<=count;i++) {
			System.out.print(age[i]+" ");
		}
		System.out.println("");
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n ;
		n=sc.nextInt();
		int number = number(n);
		System.out.println(number);
	}	

}
