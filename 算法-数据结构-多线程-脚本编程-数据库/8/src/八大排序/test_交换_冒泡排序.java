/**
 * 
 */
package 八大排序;

import java.util.Random;

/**
 *	冒泡排序的基本思想：它是通过两者不断交换的方式进行排序的。
 */
public class test_交换_冒泡排序 {
	public static void MPSort(int[] number) {
		boolean flag = true;
		int temp=0;
		int max=number.length;
		for(int i=0;i<max-1&&flag;i++) {
			flag=false;
			for(int j=i+1;j<max;j++) {
				if(number[i]>number[j]) {
					temp=number[j];
					number[j]=number[i];
					number[i]=temp;
					flag=true;
				}
			}
		}
		for(int i=0;i<max;i++) {
			System.out.print(number[i]+"  ");
		}
	}
	
	public static void main(String[] args) {
		Random random = new Random();
		int[] number = new int[10];
		for(int i=0;i<10;i++) {
			number[i] = (int)(random.nextInt(100));
		}
		for(int i=0;i<number.length;i++) {
			System.out.print(number[i]+"  ");
		}
		System.out.println("");
		MPSort(number);
	}

}
