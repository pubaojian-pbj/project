package 八大排序;

import java.util.Random;

/**
 *	直接选择排序：对于选择排序而言，它是将元素分成两堆，右半部分为已排好序的元素，左半部分为为排好序的元素，每次从左半部分找出一个
 *	最小的元素，添加到右半部分元素的末尾，对于选择排序而言他的时间复杂度为O(n2),是不稳定的排序。
 */
public class test_选择_直接选择排序 {
	
	public static void selectSort(int[] number) {
		int max=number.length;
		int temp;
		int m;
		for(int i=0;i<max-1;i++) {
			m=i;
			for(int j=i+1;j<max;j++) {
				if(number[m]>number[j])
					m=j;
			}
			if(m!=i) {
				temp=number[m];
				number[m] = number[i];
				number[i]=temp;
			}
		}
		for (int i : number) {
			System.out.print(i+"  ");
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
		selectSort(number);
	}

}
