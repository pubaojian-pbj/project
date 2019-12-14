/**
 * 
 */
package 八大排序;

import java.util.Random;

/**
 * @author pubaojian 2019年4月29日
 *
 */
public class test_基数排序_桶排序 {
	public static void bucketSort(int[] number) {
		int[][] temp = new int[10][10];
		int[] count = new int[10];
		int max=number.length;
		int n=1,k=0;
		System.out.println(max);
		while(n<=max){
			for(int i=0;i<max;i++) {
				int ld = ((number[i]/n)%10);
				temp[ld][count[ld]++]=number[i];
			}
			for(int i=0;i<max;i++) {
				if(count[i]!=0) {
					for(int j=0;j<count[i];j++) {
						number[k]=temp[i][j];
						k++;
					}
				}
				count[i]=0;
			}
			for(int i=0;i<max;i++) {
				System.out.print(number[i]+"  ");
			}
			System.out.println("");
			n*=10;
			k=0;
		}
		for(int i=0;i<max;i++) {
			System.out.print(number[i]+"  ");
		}
		System.out.println("");
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
		bucketSort(number);
	}
}
