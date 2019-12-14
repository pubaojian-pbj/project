package 八大排序;

import java.util.HashMap;
import java.util.Random;

/**
 * 直接插入排序思想：类似于纸牌游戏，非为两部分，左半部分为已排好序的数组元素，右半部分为未排序
 * 数组元素，每次取出右半部分未排序数组元素中的第一个，插入到左半部分已排好序部分的恰当位置，知道右半部分
 * 数组元素取完未知，对于插入排序而言他的最坏时间复杂度为O（n2),在空间复杂度上需要一个元素的辅助空间，既空间
 * 复杂度为O（1）的复杂度，并且插入排序是稳定的，它既适用于顺序存储结构也适用于链式存储结构，并且在链式存储结构中、
 * 它的性能更优。
 *
 */
public class test_插入排序_直接插入排序 {
	public static void InsertSort(int[] number) {
		int temp;
		for(int i=1;i<number.length;i++) {
			temp=number[i];
			int j=i-1;
			while(temp<number[j]) {
				number[j+1]=number[j];
				j--;
				if(j==-1)
					break;
			}
			number[j+1]=temp;
		}
		for(int i=0;i<number.length;i++) {
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
		InsertSort(number);
	}

}
