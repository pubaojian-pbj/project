package 八大排序;

import java.util.HashMap;
import java.util.Random;

/**
 *	堆排序分为大顶堆和小顶堆，在进行升序排序输出时，使用小顶堆，每次取出堆顶的元素，然后于最后一个叶子结点交换，然后再调整称为一个
 *	小顶堆，可以使用一维阵列来存储堆积数的所有元素与其顺序。
 */
public class test_选择_堆排序 {

	private static void swap(int[] number,int i,int j) {
		int temp = number[j];
		number[j]=number[i];
		number[i]=temp;
		HashMap map = new HashMap();
		map.put(1, 2);
	}
	public static void creatHeap(int[] number) {
		int max=number.length-1;
		int[] heap = new int[max+1];
		for(int i=1;i<=max;i++) {
			heap[i]=number[i];
			int s=i;
			int p=i/2;
			while(s>=2&&heap[p]>heap[s]) {
				swap(heap,p,s);
				s=p;
				p=s/2;
			}
		}
		for(int i=1;i<=max;i++) {
			number[i]=heap[i];
			System.out.print(number[i]+"  ");
		}
		System.out.println("");
		HeapSort(number);
	}
	public static void HeapSort(int[] number) {
		int max = number.length-1;
		int m =max;
		while(m>1) {
			swap(number,1,m);
			m--;
			int p=1;
			int s=2*p;
			while(s<=m) {
				if(s<m&&number[s]>number[s+1]) {
					s++;
				}
				if(number[p]<=number[s])
					break;
				swap(number,p,s);
				p=s;
				s=2*p;
			}
			
		}
		for(int i=max;i>=1;i--) {
			System.out.print(number[i]+"  ");
		}
	}
	public static void main(String[] args) {
		Random random = new Random();
		int[] number = new int[11];
		for(int i=1;i<=10;i++) {
			number[i] = (int)(random.nextInt(100));
		}
		for(int i=1;i<number.length;i++) {
			System.out.print(number[i]+"  ");
		}
		System.out.println("");
		creatHeap(number);
	}

}
