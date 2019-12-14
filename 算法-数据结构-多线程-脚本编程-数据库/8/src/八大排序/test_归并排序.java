/**
 * 
 */
package 八大排序;

import java.util.Random;

/**
 * @author pubaojian 2019年4月29日
 *
 */
public class test_归并排序 {

	public static void mergeSort(int[] number1,int[] number2,int[] number3) {
		int i=0;
		int j=0;
		int k=0;
		System.out.println(number1.length+" ,"+number2.length);
		while(i<number1.length && j<number2.length) {
			if(number1[i]<=number2[j]) 
				number3[k++] = number1[i++];
			else
				number3[k++]=number2[j++];
		}
		while(i<number1.length) {
			number3[k++]=number1[i++];
		}
		while(j<number2.length) {
			number3[k++]=number1[j++];
		}
		
	}
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
			int temp=number[right];
			number[right]=number[i+1];
			number[i+1]=temp;
		return i+1;
	}
	public static void quickSort(int[] number,int left,int right) {
		if(left<right) {
			int p = partition(number,left,right);
			quickSort(number,left,p-1);
			quickSort(number,p+1,right);
		}
	}
	public static void main(String[] args) {
		Random random = new Random();
		int[] number1 = new int[11];
		int[] number2=new int[11];
		int[] number3=new int[22];
		for(int i=0;i<=10;i++) {
			number1[i] = (int)(random.nextInt(100));
			number2[i] = (int)(random.nextInt(100));
		}
		for(int i=0;i<number1.length;i++) {
			System.out.print(number1[i]+"  ");
		}
		System.out.println("");
		for(int i=0;i<number2.length;i++) {
			System.out.print(number2[i]+"  ");
		}
		System.out.println("");
		quickSort(number1,0,10);
		quickSort(number2,0,10);
		mergeSort(number1,number2,number3);
		for(int i=0;i<number1.length;i++) {
			System.out.print(number1[i]+"  ");
		}
		System.out.println("");
		for(int i=0;i<number2.length;i++) {
			System.out.print(number2[i]+"  ");
		}
		System.out.println("");
		for(int i=0;i<number3.length;i++) {
			System.out.print(number3[i]+"  ");
		}
		System.out.println("");
	}

}
