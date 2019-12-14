package 面试算法题;

import java.util.Scanner;

public class two_num {

	public static int[] twoSum(int[] nums, int target) {
		int[] a= new int[2];
		for(int i=0;i<nums.length-1;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j]==target) {
					a[0]=i;
					a[1]=j;
				}
			}
		}
	    return a;
	}
	    
	public static void main(String[] args) {
		int[] nums = new int[4];
		int[] a = new int[2];
		int target = 0;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<4;i++) {
				nums[i] = sc.nextInt();
		}
		target = sc.nextInt();
		a=twoSum(nums,target);
		System.out.println("["+a[0]+","+a[1]+"]");
	}

}
