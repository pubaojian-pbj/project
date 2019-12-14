/**
 * 
 */
package 八大排序;

import java.util.Random;

/**
 * 快速排序：有三种进阶形式，第一种以左边第一个元素为轴，第二种以中间元素为轴，第三种以右边第一个元素为轴。
 * 
 *
 */
public class test_交换_快速排序 {
	//这是快速排序最优的一种的排序算法，以最右边的元素作为轴进行操作，其中将可以将一个数组分为三部分，第一部分是小于
	//轴值的部分，第二部分是大于轴值的部分，第但部分是还未遍历的数组部分，经过一次快速排序后，将轴插入到第一部分与第二部分的结合处。
	//然后将剩下部分分别进行递归操作，得到做终的排序结果。
	public static int partition(int[] number,int left,int right) {
		int s=number[right];
		int i=left-1;
		for(int j=left;j<right;j++) {
			if(number[j]<=s) {
				i++;
				int temp = number[j];
				number[j]=number[i];
				number[i]=temp;
			}
		}
		int temp = number[right];
		number[right]=number[i+1];
		number[i+1]=temp;
		return i+1;
	}
	public static void quickSort3(int[] number,int left,int right) {
		if(left<right) {
			int q= partition(number,left,right);
			quickSort3(number,left,q-1);
			quickSort3(number,q+1,right);
		}
	}
	//以该数组中的中间位置的结点为轴进行快速排序，减少了最后一此去改变轴的位置
	public static void quickSort2(int[] number,int left,int right) {
		if(left<right) {
			int s=number[(left+right)/2];
			int i = left-1;
			int j=right+1;
			while(true) {
				//向右找,找到一个大于轴值的值
				while(number[++i]<s);
				//向左找，找到一个小于轴值的值
				while(number[--j]>s);
				if(i>=j)
					break;
				int temp=number[i];
				number[i]=number[j];
				number[j]=temp;
			}
			quickSort2(number,left,i-1);
			quickSort2(number,j+1,right);
		}
	}
	//左边的第一个结点作为轴。
	public static void quickSort(int[] number,int left,int right) {
		int s=0;
		if(left<right) {
			s=number[left];
			int i=left;
			int j=right+1;
			while(true) {
				//向右找,找到一个大于轴值的值
				while(i+1<number.length && number[++i]<s);
				//向右找，找到一个小于轴值的值
				while(j-1>-1 && number[--j]>s);
				if(i>=j)
					break;
				int temp = number[i];
				number[i]=number[j];
				number[j]=temp;
			}
			number[left]=number[j];
			number[j]=s;
			quickSort(number,left,j-1);//对右边进行递回
			quickSort(number,j+1,right);//对左边进行递回
		}
	}
	public static void main(String[] args) {
		Random random = new Random();
		int max=10;
		int[] number = new int[max];
		for(int i=0;i<max;i++) {
			number[i] = (int)(random.nextInt(10*max));
		}
		for(int i=0;i<number.length;i++) {
			System.out.print(number[i]+"  ");
		}
		System.out.println("");
		int start=(int) System.currentTimeMillis();
//		quickSort(number,0,max-1);
//		quickSort2(number,0,max-1);
		quickSort3(number,0,max-1);
		int end=(int) System.currentTimeMillis();
		System.out.println(end-start+"ms");
		for(int i=0;i<number.length;i++) {
			System.out.print(number[i]+"  ");
		}
	}

}
