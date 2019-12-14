/**
 * 
 */
package 八大排序;

import java.util.*;

/**
 * @author pubaojian 2019年5月6日
 *
 */
public class test {
	public static void heapSort(int[] number) {
		int max=number.length-1;
		int m=max;
		while(m>1){
			int temp = number[m];
			number[m]=number[1];
			number[1]=temp;
			m--;
			int p=1;
			int s=p*2;
			while(s<=m) {
				if(s<m && number[s]>=number[s+1]) {
					s++;
				}
				if(number[p]<=number[s])
					break;
				temp=number[s];
				number[s]=number[p];
				number[p]=temp;
				p=s;
				s=2*p;
			}
		}
		System.out.println("");
		for(int i=max;i>=1;i--) {
			System.out.print(number[i]+"  ");
		}
	}
	public static void createHeapSort(int[] number) {
		int max=number.length-1;
		int[] heap = new int[10];
		for(int i=1;i<=max;i++) {
			heap[i]=number[i];
			int s=i;
			int p=i/2;
			while(s>=2 && heap[p]>heap[s]) {
				int temp =heap[s];
				heap[s]=heap[p];
				heap[p]=temp;
				s=p;
				p=s/2;
			}
		}
		System.out.println("");
		for(int i=1;i<=max;i++) {
			number[i]=heap[i];
			System.out.print(number[i]+"  ");
		}
		heapSort(number);
	}
	public static void main(String[] args) {
		Random random = new Random();
		int[] number = new int[10];
		for(int i=1;i<10;i++) {
			number[i] = random.nextInt(100);
			System.out.print(number[i]+"  ");
		}
		createHeapSort(number);
		
	}

}
