package 面试算法题;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Leetcode_两个排序数组的中位数 {

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
			int i=0,j=0;
			int countNum1 = nums1.length;
			int countNum2 = nums2.length;
			List<Integer> list  =new ArrayList();
			while(i<countNum1 && j<countNum2) {
				if(nums1[i]<nums2[j]){
					list.add(nums1[i]);
					i++;
				}
				else {
					list.add(nums2[j]);
					j++;
				}
			}
			while(i<countNum1) {
				list.add(nums1[i]);
				i++;
			}
			while(j<countNum2) {
				list.add(nums2[j]);
				j++;
			}
			int max = list.size();
			if(max%2==0) {
				double a= list.get((max/2));
				double b = list.get(max/2-1);
				double m =(a+b)/2;
				System.out.println(m);
			}
			else {
				int a= max/2;
				System.out.println(list.get(a));
			}
			System.out.println(max);
	        return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums1 = new int[5];
		int[] nums2 = new int[5];
		for(int i=0;i<5;i++) {
			nums1[i]=sc.nextInt();
		}
		for(int j=0;j<5;j++) {
			nums2[j]=sc.nextInt();
		}
		findMedianSortedArrays(nums1,nums2);
	}

}
