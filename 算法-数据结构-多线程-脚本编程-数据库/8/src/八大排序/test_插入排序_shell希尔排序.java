package 八大排序;

import java.util.Random;

/**
 * 插入排序-希尔排序：希尔排序是对直接插入排序的改良，对于排序加快的基本原则，是让最后一次排序进行时，
 * 尽量利用前一次的排序结果，以加快排序速度，希尔排序就是利用这样的思想解决问题。希尔排序的时间复杂度为O(n2)
 * 且需要一个元素的辅助空间，既空间复杂度为O（1），并且它是一种不稳定的排序算法。
 * 
 * 具体思路：它在每次进行插入排序时并不是所有的元素同时进行，而是取一段间隔，希尔排序每次将间隔设置为n/2,然后
 * 跳跃进行插入排序，然后再将间隔设置为n/4,跳跃进行排序动作，然后再将其按照2的倍数依次分割，直到间隔为1的
 * 最后一次排序终止，由于上一次的排序动作都会将固定间隔内的元素排序好，因此当间隔越来越小，一些元素的位于正
 * 确位置的几率越高，因此最后几次的排序动作将大幅降低。  
 * 
 *
 */
public class test_插入排序_shell希尔排序 {
	public static void shellSort(int[] number) {
		int max = number.length;
		int grap=max/2;
		int temp;
		while(grap>0) {
			for(int i=0;i<grap;i++) {
				for(int j=i+grap;j<max;j+=grap) {
					for(int k=j-grap;k>=i;k-=grap) {
						if(number[k]>number[k+grap]) {
							temp = number[k+grap];
							number[k+grap]=number[k];
							number[k]=temp;
						}
					}
				}
			}
			grap=grap/2;
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
		shellSort(number);
	}

}
